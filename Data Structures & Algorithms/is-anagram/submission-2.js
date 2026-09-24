class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s, t) {

        if(s.length==0 && t.length===0){
            return true;
        }

        if(s.length != t.length){
            return false;
        }
     
     let map1=new Map();
     let map2=new Map();

     for(let e of s){
         if(map1.has(e)){
            map1.set(e, map1.get(e)+1);
         }else{
            map1.set(e, 1);
         }
     }

     for(let e of t){
         if(map2.has(e)){
            map2.set(e, map2.get(e)+1);
         }else{
            map2.set(e, 1);
         }
     }

     for(let e of s){
         if(map1.get(e)!==map2.get(e)){
            return false;
         }
     }
      return true;
    }
}
