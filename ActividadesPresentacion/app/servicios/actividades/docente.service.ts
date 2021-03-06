import {Injectable} from '@angular/core';
import { Http, Response } from '@angular/http';
import { Observable }     from 'rxjs/Observable';
import {Docente} from "../../modelo/actividades/docente";
@Injectable()
export class DocenteService {
    constructor(private http: Http) { }

    private docenteUrl = 'http://localhost:8084/ActividadesWeb/docente/docente/consultar';  // URL to web api

    consultarDocentes(): Observable<Docente[]> {
        return this.http.get(this.docenteUrl)
            .map(this.extractData)
            .catch(this.handleError);
    }

    private extractData(res: Response) {
        if (res.status < 200 || res.status >= 300) {
            throw new Error('Bad response status: ' + res.status);
        }
        let body = res.json();
        return body || [];
    }
    private handleError(error: any) {
        // In a real world app, we might send the error to remote logging infrastructure
        let errMsg = error.message || 'Server error';
        console.error(errMsg); // log to console instead
        return Observable.throw(errMsg);
    }
}