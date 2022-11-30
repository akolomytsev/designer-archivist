angular.module('app', []).controller('indexController', function ($scope, $http) {
    const contextPath = 'http://localhost:8181/app';

    $scope.loadNumbers = function () {
        $http.get(contextPath + '/numbers')
            .then(function (response) {
                $scope.NumbersList = response.data;
            });
    };

//    $scope.deleteStudent = function (studentId) {
//        $http.get(contextPath + '/students/delete/' + studentId)
//            .then(function (response) {
//                $scope.loadStudents();
//            });
//    }
//
//    $scope.changeScore = function (studentId, delta) {
//        $http({
//            url: contextPath + '/students/change_score',
//            method: 'GET',
//            params: {
//                studentId: studentId,
//                delta: delta
//            }
//        }).then(function (response) {
//            $scope.loadStudents();
//        });
//    }

    $scope.loadNumbers();
});