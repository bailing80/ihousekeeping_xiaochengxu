$(document).ready(function() {
	// 初始化就查询数据
	query();
	$("#add_test").click(show_add);
	// 加载分页
	$("#page").load(getRootPath() + "/html/admin/page/page.html");
});

function query() {
	var parm = {
		url : getRootPath() + "/Goods_Controller_4W/queryAllTest.action",
		data : null,
		table_obj : $("#datatable"),
		title : [ "商品名称", "商品类别", "商品价格" ],
		data_column : [ "merchandise", "category", "price" ],
		contextType : [ "text", "text", "text" ],
		title_column_width : [ "25%", "25%", "30%" ],
		optr : [ "操作" ],
		optr_project : [ "编辑","删除"],
		optr_color : [ "#62a8d1", "#66cc99"],
		optr_callback : [ "edit","del" ],
		optr_column_width : [ "15%" ]
	};
	showTable(parm);
}

function del(id){
	var obj = new Object();
	obj.id = id;
	$.ajax({
		url : getRootPath() + "/Goods_Controller_4W/delete_test.action",
		data : obj,
		success : flush
	});
}

function show_add() {
	var parm = {
		title : "新增测试数据",
		html :  getRootPath()+"/BaseMultiController/toPage.action?page=main/goods/goods_test",
		width : "50%",
		height : "50%",
		div_obj : $("#new_div"),
		buttons : [ "保存", "退出" ],
		buttons_callback : [add_test, exit]
	};
	show_new_div(parm);
}

function add_test(){
	var name = $("#name").val();
	var age = $("#age").val();
	var height = $("#height").val();
	var obj = new Object();
	obj.merchandise = name;
	obj.category = age;
	obj.price = height;
	$.ajax({
		url :getRootPath()+"/Goods_Controller_4W/add_test.action",
		data : obj,
		success : flush
	});
}

function flush(){
	query();
	exit();
}

function exit(){
	$("#new_div").hide();
	$("#backdiv").hide();
}




function edit() {

}