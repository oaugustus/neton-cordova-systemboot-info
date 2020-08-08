
var exec = require('cordova/exec');

var PLUGIN_NAME = 'SystemBootInfo';

var SystemBootInfo = {
  getLastBootTime: function(onSuccess, onFail) {
    exec(onSuccess, onFail, PLUGIN_NAME, 'getLastBootTime', []);
  }
};

module.exports = SystemBootInfo;
