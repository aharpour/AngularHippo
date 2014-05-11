'use strict';

// Declare app level module which depends on filters, and services
angular.module('myApp',
		[ 'myApp.filters', 'myApp.services', 'myApp.directives', 'myApp.controllers', 'ngRoute', 'ngSanitize']).config(
		[ '$routeProvider', function($routeProvider) {
			$routeProvider.when('#/', {
				redriectTo : '#/common/homepage'
			});
			$routeProvider.when('/:sub1?/:sub2?/:sub3?/:sub4?/:sub5?', {
				controller : 'BaseCtrl',
				template : '<div ng-include="config.template"></div>'
			});
			$routeProvider.otherwise({
				redriectTo : '#/common/homepage'
			});
		} ]);
