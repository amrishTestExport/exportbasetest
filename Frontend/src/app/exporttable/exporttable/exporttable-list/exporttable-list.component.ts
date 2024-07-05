import { Component, OnInit,inject } from '@angular/core';
import { ExporttableListBaseComponent } from '@baseapp/exporttable/exporttable/exporttable-list/exporttable-list.base.component';
import { ExporttableService } from '@baseapp/exporttable/exporttable/exporttable.service';


@Component({
  selector: 'app-exporttable-list',
  templateUrl: '../../../../../base/app/exporttable/exporttable/exporttable-list/exporttable-list.component.html',
  styleUrls: ['./exporttable-list.scss']
})
export class ExporttableListComponent extends ExporttableListBaseComponent implements OnInit {
 
	
  ngAfterViewInit(): void {
    this.onAfterViewInit()
  }

  ngOnInit(): void {
    super.onInit();
  }
 
}