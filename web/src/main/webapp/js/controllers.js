'use strict';

/* Controllers */

angular.module('myApp.controllers', [])
    .controller('BaseCtrl', ['$scope', '$location', '$http', function($scope, $location, $http) {
    	  $http.get(contextPath + $location.path()).
    	    success(function(data, status, headers, config) {
    	      $scope.content = data.model;
    	      $scope.config = data.config;
    	      $scope.children = data.children;
    	      
    	    }).
    	    error(function(data, status, headers, config) {
    	      // log error
    	    });	
    }])
    .controller('Home', ['$scope', '$location', '$http', function($scope, $location, $http) {
    	$http.get(contextPath + '/common/homepage').
    	success(function(data, status, headers, config) {
    		$scope.content = data.model;
    		$scope.config = data.config;
    		$scope.children = data.children;
    		
    	}).
    	error(function(data, status, headers, config) {
    	});	
    }])
;
