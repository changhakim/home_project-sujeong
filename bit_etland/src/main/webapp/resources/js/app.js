"use strict";
var app = app||{};

app=(()=>{
	let init=x=>{
		app.$.init(x);
	}
	let onCreate=()=>{
		
		setContentView();
	}
	let setContentView=()=>{
		$.when(
		$.getScript($.js()+'/component/compo.js')
		).done(()=>{
			auth.init();

		});
	}
	return {init:init,
			onCreate:onCreate
			}
	
	
})();

app.$={
		
		init:x=>{
			
			$.getScript(x+'/resources/js/router.js',
			()=>{
				$.extend(new Session(x))
				
				app.onCreate(); 
				
			});
			
		}
		
}