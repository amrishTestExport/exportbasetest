import { Component, OnInit,inject } from '@angular/core';
import { ExporttableDetailBaseComponent } from '@baseapp/exporttable/exporttable/exporttable-detail/exporttable-detail.base.component';
import { ExporttableService } from '@baseapp/exporttable/exporttable/exporttable.service';


@Component({
  selector: 'app-exporttable-detail',
  templateUrl: '../../../../../base/app/exporttable/exporttable/exporttable-detail/exporttable-detail.component.html',
  styleUrls: ['./exporttable-detail.scss']
})
export class ExporttableDetailComponent extends ExporttableDetailBaseComponent implements OnInit {
 
	
  ngAfterViewInit(): void {
    this.onAfterViewInit()
  }

  ngOnInit(): void {
    super.onInit();
  }
 
}