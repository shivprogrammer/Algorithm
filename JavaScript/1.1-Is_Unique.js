'use strict';

/*
1.1 Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
*/

function isUnique(str) {
  var characterMap = new Map();
  characterMap.set(str.charAt(0), 1);

  for (var i = 1; i < str.length; i++) {
    if (!characterMap.has(str.charAt(i))) {
      characterMap.set(str.charAt(i), 1);
    }
    else {
      return false;
    }

    return true;
  }
}
