import { ApplicationConfig, provideZoneChangeDetection } from '@angular/core';
import {provideRouter, Routes} from '@angular/router';
import {FinishtypeListComponent} from "./component/finishtype-list/finishtype-list.component";
import {ClientListComponent} from "./component/client-list/client-list.component";

import { provideClientHydration } from '@angular/platform-browser';
import {provideHttpClient} from "@angular/common/http";
import {ClientComponent} from "./component/client/client.component";
import {PropertytypeComponent} from "./component/PropertyType/propertytype.component";


export const routes:Routes=[
  { path: 'finishTypes', component: FinishtypeListComponent },
  {path: 'clients', component: ClientListComponent},
  {path: 'client/:clientId', component: ClientComponent},
  {path: 'propertyTypes', component: PropertytypeComponent}
];


export const appConfig: ApplicationConfig = {
  providers: [provideZoneChangeDetection({ eventCoalescing: true }), provideRouter(routes), provideClientHydration(),
    provideHttpClient()]
};
