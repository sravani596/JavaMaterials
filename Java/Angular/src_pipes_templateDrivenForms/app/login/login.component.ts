import { Component } from '@angular/core';
import { Employee } from './employee';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {


   emp:Employee = {"eid":0,"ename":"","salary":0};

   

   getFormData(data:Employee){

      console.log(data)

   }

}
