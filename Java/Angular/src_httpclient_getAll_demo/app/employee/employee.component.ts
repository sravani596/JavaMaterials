import { Component } from '@angular/core';
import { EmployeeService } from './employee.service';
import { Employee } from './employee';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css'],
  providers:[EmployeeService]
})
export class EmployeeComponent {

      empList:Employee[] = [];

        constructor(private service:EmployeeService){


        }

        getAllData(){

         this.service.getAllEmployees().subscribe( (inputs)=>{   this.empList = inputs; } );


        }


}
