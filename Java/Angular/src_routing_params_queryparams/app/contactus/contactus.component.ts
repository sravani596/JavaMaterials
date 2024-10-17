import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-contactus',
  templateUrl: './contactus.component.html',
  styleUrls: ['./contactus.component.css']
})
export class ContactusComponent {

     list:any = [];

      flag:boolean = false;

    constructor(private route:ActivatedRoute){


    }


    show(){

          this.flag = true;

        this.route.queryParams.subscribe(  (inputs)=>{  this.list = inputs;
                                                         console.log(this.list) } )


    }




}
