import { Component, OnInit } from '@angular/core';
import { Laptops } from '../interfaces/laptops';
import { Service1Service } from '../services/service1.service';

@Component({
  selector: 'app-goods',
  templateUrl: './goods.component.html',
  styleUrls: ['./goods.component.scss']
})
export class GoodsComponent implements OnInit {

  LaptopsList:Laptops [] = [];
  //isClicked: boolean = true;
  selectedLaptop?:Laptops;

  constructor(private service:Service1Service) { }

  // ClickButton() {
  //   this.isClicked = !this.isClicked;
  // }
  ngOnInit(): void {
    this.updateLaptop();
    this.service.list.subscribe(
      (list:Laptops[])=>{this.LaptopsList=list}
    )
  }

  updateLaptop() {
    this.service.getLaptops().subscribe(
      (laptops) => {
        //this.LaptopsList=laptops;
        this.service.setList(laptops);
      }
    );
  }

  addLaptop(laptop:Laptops) {
    this.service.postLaptop(laptop).subscribe(
      (laptop) => {
        this.updateLaptop();
      }
    )
  }

  deleteLaptop(laptop:Laptops) {
    this.service.deleteLaptop(laptop).subscribe(
      () => {
        this.updateLaptop();
      }
    )
  }

  // setLaptopsList = (list: Laptops[]): void => {
  //   this.LaptopsList = list;
  // }

  onSelect(laptop:Laptops) {
    if (this.selectedLaptop && laptop.id == this.selectedLaptop.id) {
      this.selectedLaptop = undefined;
    }
    else {
      this.selectedLaptop=laptop;
    }
  }

}