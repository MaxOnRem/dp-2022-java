import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { BehaviorSubject, Observable } from 'rxjs';
import { Laptops } from '../interfaces/laptops';

@Injectable({
  providedIn: 'root'
})
export class Service1Service {

  list = new BehaviorSubject<Laptops[]>([]);
  url: string = "/lab3/Servlet1";

  constructor(private http: HttpClient) { }

  getLaptops(): Observable<Laptops[]> {
    return this.http.get<Laptops[]>(this.url);
  }

  postLaptop(laptop:Laptops): Observable<Laptops[]> {
    return this.http.post<Laptops[]>(this.url,laptop);
  }

  putLaptop(laptop:Laptops): Observable<Laptops[]> {
    return this.http.put<Laptops[]>(this.url+"/"+laptop.id,laptop);
  }

  deleteLaptop(laptop:Laptops): Observable<Laptops[]> {
    return this.http.delete<Laptops[]>(this.url+"/"+laptop.id);
  }

  setList(list:Laptops[]) {
    this.list.next(list);
  }
}
