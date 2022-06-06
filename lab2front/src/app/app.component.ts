import { Component } from '@angular/core';
import { Tables } from './interfaces/tables';
import { Service1Service } from './services/service1.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
})
export class AppComponent {
  title = 'lab1front';
  tableList: Tables[] = [];

  constructor(private service: Service1Service) {}

  getTables(): void {
    this.service.getTables().subscribe((table) => {
      this.tableList = table;
    });
  }
}
