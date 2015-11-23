/* 
 判断选中的点是否在某区域内
 输入: targetPoint =  [lat，lang];  //数组
       areaCoord  = [{lat:value,lng:value},{lat:value,lng:value}...] //json格式
 输出：true/false
*/
function containsLocation(targetPoint, areaCoord) {
  print(targetPoint);
  print(areaCoord);
  var myPolygon = new google.maps.Polygon({paths: areaCoord});
  var myLatlng = new google.maps.LatLng(targetPoint[0],targetPoint[1]);
  var result = google.maps.geometry.poly.containsLocation(myLatlng, myPolygon)?"yes":"no";
  if(result == 'yes') {
      return true;
  }else if(result == 'no'){ 
      return false;
  }else {
      return 'error'; 
  }  
}



/* 测试用例 */
function initMap() {
  var areasCoord = [
    {lat: 25.774, lng: -80.19},
    {lat: 18.466, lng: -66.118},
    {lat: 32.321, lng: -64.757}
  ];
  var targetPoint =  [18.466,-66.118];  //edge, true
  var targetPoint2 = [25.774,-80.19];   //edge, true
  var targetPoint3 = [32.321,-64.757];  //edge, true
  var targetPoint4 = [29.420,-66.310];  //inside the area, true
  var targetPoint5 = [27.059,-72.07];   //inside the area, true
  var targetPoint6 = [26.549,-68.071];  //inside the area, true
  var targetPoint7 = [38.552, -63.022]; //ouside, false
  var targetPoint8 = [28.987, -86.387]; //ouside, false
  var targetPoint9 = [21.289, -59.340]; //ouside, false

  var centerLatLng = new google.maps.LatLng(targetPoint[0],targetPoint[1]);
  // initiate GoogleMap
  var map = new google.maps.Map(document.getElementById('map'), {
    center: centerLatLng,
    zoom: 5,
  }); 
  alert("1: "+containsLocation(targetPoint, areasCoord)+"; 2: "+containsLocation(targetPoint2, areasCoord)
    +"; 3: "+containsLocation(targetPoint3, areasCoord)+";4: "+containsLocation(targetPoint4, areasCoord)
    +";5: "+containsLocation(targetPoint5, areasCoord)+";6: "+containsLocation(targetPoint6, areasCoord)
    +";7: "+containsLocation(targetPoint7, areasCoord)+";8: "+containsLocation(targetPoint8, areasCoord)
    +";9: "+containsLocation(targetPoint9, areasCoord));
}




