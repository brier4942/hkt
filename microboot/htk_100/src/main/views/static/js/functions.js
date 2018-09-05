

//Window Loaded Handler
  $(window).load(function() {'use strict';
	$(".loader").fadeOut("slow");
  });

jQuery(function($) {'use strict';

  //goto TOP Button
	 $('.go-top').on('click', function(){
		$('html, body').animate({scrollTop: 0}, 800);
	 });
	 
	 
	 
	   
// ============= to input quantity (Shop page)============== 
	$('.spinner input').keydown(function(e){
		e.preventDefault();
		return false;
	});
	 var minNumber = 1;
	 var maxNumber = 10;
	 $('.spinner .btn:first-of-type').on('click', function() {
		  if($('.spinner input').val() == maxNumber){
				return false;
		  }else{
				$('.spinner input').val( parseInt($('.spinner input').val(), 10) + 1);
		  }
	 });

	 $('.spinner .btn:last-of-type').on('click', function() {
		  if($('.spinner input').val() == minNumber){
				return false;
		  }else{
				$('.spinner input').val( parseInt($('.spinner input').val(), 10) - 1);
		  }
	 });

 // ============== Timmer ================== 
  $('.countdown').final_countdown();
  
 
  // ================ Accordions =============== 
  $(".set > a").on("click", function(){
    if($(this).hasClass('active')){
      $(this).removeClass("active");
      $(this).siblings('.content').slideUp(500);
      $(".set > a i").removeClass("fa-minus").addClass("fa-plus");
    }else{
      $(".set > a i").removeClass("fa-minus").addClass("fa-plus");
    $(this).find("i").removeClass("fa-plus").addClass("fa-minus");
    $(".set > a").removeClass("active");
    $(this).addClass("active");
    $('.content').slideUp(500);
    $(this).siblings('.content').slideDown(500);
    }
    
  });
  
    
     // =============== tabbed content =================
    $(".tab_content").hide();
    $(".tab_content:first").show();
    $("ul.tabs li").on('click', function() {
		  $(".tab_content").hide();
		  var activeTab = $(this).attr("rel"); 
		  $("#"+activeTab).fadeIn();		
		  
		  $("ul.tabs li").removeClass("active");
		  $(this).addClass("active");

		  $(".tab_drawer_heading").removeClass("d_active");
		  $(".tab_drawer_heading[rel^='"+activeTab+"']").addClass("d_active");
	  
    });
	$(".tab_drawer_heading").on('click', function() {
       $(".tab_content").hide();
       var d_activeTab = $(this).attr("rel"); 
       $("#"+d_activeTab).fadeIn(1200);
	  
	    $(".tab_drawer_heading").removeClass("d_active");
       $(this).addClass("d_active");
	  
	    $("ul.tabs li").removeClass("active");
	    $("ul.tabs li[rel^='"+d_activeTab+"']").addClass("active");
    });
  
  
  
 // ================ Owl Carousel ==================== 
	 
	 //Four Col Products
	 $("#fourCol-slider").owlCarousel({
		  autoPlay: false,
		  pagination : false,
		  navigation : true,
		  navigationText :["<i class='fa fa-angle-left'></i>","<i class='fa fa-angle-right'></i>"],
		  items : 4,
		  itemsDesktop : [1199,3],
		  itemsDesktopSmall : [979,2],
	      itemsMobile:[500,2],
	 });
	 $("#fourCol-slider_2").owlCarousel({
		  autoPlay: false,
		  pagination : false,
		  navigation : true,
		  navigationText :["<i class='fa fa-angle-left'></i>","<i class='fa fa-angle-right'></i>"],
		  items : 4,
		  itemsDesktop : [1199,3],
		  itemsDesktopSmall : [979,2],
	      itemsMobile:[500,2],
	 });
	 
	 //Brands
	 $("#brand-slider").owlCarousel({
		  autoPlay: true,
		  pagination : false,
		  items : 5,
		  itemsDesktop : [1199,3],
		  itemsDesktopSmall : [979,4]
	
	 });
	 
	 

    // ===============	Parallax ===================	
	
	$('#parallax2').parallax("50%", 0.2);
	$('#testinomialBg').parallax("50%", 0.2);
	$('#newsletter').parallax("50%", 0.2);
});


