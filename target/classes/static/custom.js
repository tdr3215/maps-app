	
let map;

let coords = {lat: 39.9612, lng: -82.9988}
function initMap() {

let image = {url:'/icons8-google-maps.svg',scaledSize:new google.maps.Size(50, 50)}


 map = new google.maps.Map(document.getElementById('map'), {
        center: coords,
        zoom: 10,
        scrollwheel:false
    });


let marker = new google.maps.Marker({
    position: coords,
    map: map,
    icon: image,
    animation: google.maps.Animation.BOUNCE
});

 let contentString = '<h2>Columbus, OH</h2> <p>Where your dreams come true.</p>';

 let infowindow = new google.maps.InfoWindow({
   content: contentString
 });

 google.maps.event.addListener(marker, 'click', function() {
    infowindow.open(map,marker);
 });
	

   }