"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var core_1 = require('@angular/core');
var http_1 = require('@angular/http');
var Observable_1 = require('rxjs/Observable');
var TipoActividadService = (function () {
    function TipoActividadService(http) {
        this.http = http;
        this.tipoActividadUrl = 'http://localhost:8084/ActividadesWeb/tipoactividad/tipoactividad/consultar'; // URL to web api
    }
    TipoActividadService.prototype.consultaTipoActividades = function () {
        return this.http.get(this.tipoActividadUrl)
            .map(this.extractData)
            .catch(this.handleError);
    };
    TipoActividadService.prototype.extractData = function (res) {
        if (res.status < 200 || res.status >= 300) {
            throw new Error('Bad response status: ' + res.status);
        }
        var body = res.json();
        return body || [];
    };
    TipoActividadService.prototype.handleError = function (error) {
        // In a real world app, we might send the error to remote logging infrastructure
        var errMsg = error.message || 'Server error';
        console.error(errMsg); // log to console instead
        return Observable_1.Observable.throw(errMsg);
    };
    TipoActividadService = __decorate([
        core_1.Injectable(), 
        __metadata('design:paramtypes', [http_1.Http])
    ], TipoActividadService);
    return TipoActividadService;
}());
exports.TipoActividadService = TipoActividadService;
//# sourceMappingURL=tipo-actividad.service.js.map