/**
 * 
 */
$(document).ready(function() {
	var sPageURL = window.location.search.substring(1);
    $.ajax({
        url: "http://localhost:8080/location/?"+sPageURL
    }).then(function(data) {
    	$('.sPageURL').append(sPageURL);
       $('.locationId').append(data);
       
       updateProducts(data)
       
    
    });
});

function updateProducts(location){
	$.ajax({
        url: "http://localhost:8080/availableProducts/?location="+location
    }).done(function(data) {
    	console.log(data);
    	 updateProductsOnPage(data.availableProducts);
         
    	
 	   
    });
	
}

function updateProductsOnPage(availableProducts){
	 for (var i=0;i<availableProducts.length;++i)
     {
		 if(availableProducts[i].catagory=='Sports'){
			 
			 var container = $('#sportsList');
			 container.append("<p>").append(availableProducts[i].name).append("</p>");
		 }
		 if(availableProducts[i].catagory=='News'){
			 
			 var container = $('#NewsList');
			 container.append("<p>").append(availableProducts[i].name).append("</p>");
		 }
      
		 
		 
     }
}

