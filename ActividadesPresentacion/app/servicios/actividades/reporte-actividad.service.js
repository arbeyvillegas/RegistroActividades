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
var http_2 = require('@angular/http');
var Observable_1 = require('rxjs/Observable');
var ReporteActividadService = (function () {
    function ReporteActividadService(http) {
        this.http = http;
        this.serviceUrl = 'http://localhost:8084/ActividadesWeb/rest/reporteactividad/registrar';
    }
    ReporteActividadService.prototype.reportarActividad = function (datosActividad) {
        var datos = JSON.stringify(datosActividad);
        var headers = new http_2.Headers({ 'Content-Type': 'application/json' });
        var opciones = new http_2.RequestOptions({ headers: headers });
        return this.http.post(this.serviceUrl, datos, opciones)
            .map(this.construirResultado)
            .catch(this.menejarError);
    };
    ReporteActividadService.prototype.construirResultado = function () {
        return true;
    };
    ReporteActividadService.prototype.menejarError = function (error) {
        var errMsg = error.message || error.statusText || 'Error reportando actividad';
        console.error(errMsg); // log to console instead
        return Observable_1.Observable.throw(errMsg);
    };
    ReporteActividadService = __decorate([
        core_1.Injectable(), 
        __metadata('design:paramtypes', [http_1.Http])
    ], ReporteActividadService);
    return ReporteActividadService;
}());
exports.ReporteActividadService = ReporteActividadService;
//# sourceMappingURL=reporte-actividad.service.js.map