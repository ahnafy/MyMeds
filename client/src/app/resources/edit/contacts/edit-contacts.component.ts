import {Component, Inject} from '@angular/core';
import {MatDialogRef, MAT_DIALOG_DATA} from '@angular/material';
import {Contact} from "../../contact";

@Component({
    selector: 'edit-contacts.component',
    templateUrl: 'edit-contacts.component.html',
    styleUrls: ['./edit-contacts.component.scss'],
})

export class EditContactComponent {
    constructor(
        public dialogRef: MatDialogRef<EditContactComponent>,
        @Inject(MAT_DIALOG_DATA) public data: {contact: Contact}) {
    }

    onNoClick(): void {
        this.dialogRef.close();
    }

}