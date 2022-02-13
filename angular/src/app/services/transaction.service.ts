import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Transaction } from '../models/transaction';

@Injectable({
  providedIn: 'root'
})
export class TransactionService {

  constructor(private httpClient: HttpClient) { }

  getTransactions(account: string){
    return this.httpClient.get<Transaction[]>('http://localhost:8080/transactions/' + account);
  }

  postTransaction(account: string, amount: number){
    const transaction : Transaction = {
      accountNumber: account,
      amount: amount,
    }
    return this.httpClient.post<Transaction>("http://localhost:8080/transactions/add", transaction)
  }
}
