import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Employee } from './employee';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(private http:HttpClient) { }


    getAllEmployees():Observable<Employee[]>{

      return this.http.get<Employee[]>("http://localhost:3000/employees");

    }

}
