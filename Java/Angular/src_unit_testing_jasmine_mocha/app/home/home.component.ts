import { Component } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {

    username:string = 'javeed';

    amount:number = 8000;


    getData(){

      return "hello";

    }

}
