/*Maximilian Barabas */


import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title:string = 'háromszög';
  base !: number;
  height!: number;
  area !: number;
  areaShow = false;

  calcArea():void{
    if(this.checkValidation()){
    console.log("müködik")
  
      this.area = this.base * this.height / 2;
      this.base = 0;
      this.height = 0;
      this.areaShow = true;
    }else {
      alert("Hiba! Érvénytelen bemenő adatok");
    }
  }
  checkValidation():boolean {
    let valid = true;
    if(this.base <= 0) {
      valid = false;
    }
    if(this.height <= 0) {
      valid = false;
    }
    return valid;
  }
  hideArea():void {
    this.areaShow = false;
  }
}
