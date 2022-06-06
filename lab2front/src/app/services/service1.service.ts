import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Tables } from '../interfaces/tables';

@Injectable({
  providedIn: 'root',
})
export class Service1Service {
  url: string = 'http://localhost:8080/lab1/Servlet1';

  constructor(private http: HttpClient) {}
  getTables():Observable<Tables[]> {
    return this.http.get<Tables[]>(this.url);
  }
}
