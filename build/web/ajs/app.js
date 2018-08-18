/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var m=angular.module("myApp",[]);
m.controller("myController",function($scope){
    
    $scope.newUser={};
    
    
    $scope.users=[
                 ];
     $scope.messge="";
                 
    $scope.save=function(){
        console.log($scope.newUser);
        $scope.users.push($scope.newUser);
         $scope.newUser={};
         $scope.messge="New user added Successfully";
    };
    
    $scope.clickedUser={};
    $scope.selectUser=function(user){
        
        $scope.clickedUser=user;
        
    };
    
    $scope.updateUser=function(){
         $scope.messge="Update user Successfully";
    };
    
    $scope.deleteUser=function(){
       $scope.users.splice($scope.users.indexOf($scope.clickedUser),1);
        $scope.messge="Delete user Successfully";

    };
    
    
    $scope.clearMessage=function(){
         $scope.messge="";
    };
    
    
    
});
