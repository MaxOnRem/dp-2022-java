import { Component, Input, OnInit, Output, EventEmitter } from '@angular/core';
import { Laptops } from '../interfaces/laptops';
import { Service1Service } from '../services/service1.service';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.scss']
})
export class FormComponent implements OnInit {

  //@Input() setLaptopsList!: (args: Laptops[]) => void;

  @Input() laptop?:Laptops;
  @Output() updated: EventEmitter<null>= new EventEmitter();

  constructor(private service:Service1Service) { }

  ngOnInit(): void {
  }

  // updateLaptops() {
  //   this.service.putLaptop(this.laptopForm.value).subscribe((laptops) => {
  //     this.setLaptopsList(laptops as Laptops[]);
  //   });
  // }

  updateLaptop() {
    if(this.laptop) {
      this.service.putLaptop(this.laptop).subscribe(
        ()=>{
          this.updated.emit();
        }
      )
    }
  }

}
