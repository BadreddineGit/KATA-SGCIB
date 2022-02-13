import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Account } from '../models/account';

@Injectable({
  providedIn: 'root'
})
export class AccountService {

  constructor(private httpClient: HttpClient) { }

  getAccount(account: string){
    return this.httpClient.get<Account>('http://localhost:8080/accounts/' + account);
  }

}
