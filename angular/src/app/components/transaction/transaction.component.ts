import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Transaction } from 'src/app/models/transaction';
import { AccountService } from 'src/app/services/account.service';
import { TransactionService } from 'src/app/services/transaction.service';

@Component({
  selector: 'app-transaction',
  templateUrl: './transaction.component.html',
  styleUrls: ['./transaction.component.css']
})
export class TransactionComponent implements OnInit {

  transactionFormGroup!: FormGroup;
  account: string = "ACC1"
  balance!: number;

  transactions!: any[];

  constructor(private transactionService: TransactionService, private accountService: AccountService) { }

  ngOnInit(): void {
    this.transactionFormGroup = new FormGroup({
      'amount': new FormControl()
    })
    this.getTransactions();
    this.getAccount(this.account);

  }

  onCreditAccount(){
    const amount = this.transactionFormGroup.get('amount')?.value;
    this.transactionService.postTransaction(this.account, amount).subscribe(res => {
      this.transactions.push(res);
    })
    this.getTransactions();
    this.getAccount(this.account);
  }

  onDebitAccount(){
    this.transactionService.postTransaction(this.account, this.transactionFormGroup.get('amount')?.value * -1).subscribe(res => {
      this.transactions.push(res);
    })
    this.getTransactions();
    this.getAccount(this.account);
  }

  getTransactions(){
    this.transactionService.getTransactions(this.account).subscribe(res => {
      this.transactions = res;
    })
  }

  getAccount(account:string){
    this.accountService.getAccount(account).subscribe(res => {
      this.balance = res.balance
    })
  }

}
