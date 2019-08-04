$(document).ready(function() {
	// 初始化就查询数据
	query();
	$("#submit").click(addsubmit);
});


function addsubmit() {
	var obj = new Object();
	obj.name=$("#username").val();
	obj.phone=$("#userphone").val();
	$.ajax({
		url : getRootPath() + "/TB_Submit_Controller_4W/add_test.action",
		data : obj,
		success : addsuccess
	});
	
}
function addsuccess() {
	window.location.href=getRootPath() +"/BaseMultiController/toPage.action?page=main/tb_submit/submitok";
	
}

	
function query() {
	var obj = new Object();
	obj.tpye = 2;
	$.ajax({
		url : getRootPath() + "/TB_Base_Controller_4W/queryAllTest.action",
		data : obj,
		success : queryok
	});
}
function queryok(e) {
	$.each(e, function(i, d) {
		var table = $('<table>');
		var tr1 = $('<tr>');
		var tr2 = $('<tr>');
		var tr3 = $('<tr>');
		var tr4 = $('<tr>');
		var tr5 = $('<tr>');
		var td1 = $('<td>');
		var td2 = $('<td>');
		var td3 = $('<td>');
		var td4 = $('<td>');
		var td5 = $('<td>');
		var td6 = $('<td>');
		var td7 = $('<td>');
		var td8 = $('<td>');
		var td9 = $('<td>');
		var td10 = $('<td>');

		var radio1 = $('<input>');
		radio1.attr("type", "radio");
		radio1.attr("name", "radio"+i);
		radio1.attr("class", "radio");
		var radio2 = $('<input>');
		radio2.attr("type", "radio");
		radio2.attr("name", "radio"+i);radio2.attr("class", "radio");
		var radio3 = $('<input>');
		radio3.attr("type", "radio");
		radio3.attr("name", "radio"+i);radio3.attr("class", "radio");
		var radio4 = $('<input>');
		radio4.attr("type", "radio");
		radio4.attr("name", "radio"+i);radio4.attr("class", "radio");

		td1.text("题目");
		td2.text(d.title);
		tr1.append(td1);
		tr1.append(td2);

		td3.text("A");
		td3.append(radio1);
		td4.text(d.a);
		tr2.append(td3);
		tr2.append(td4);

		td5.text("B");
		td5.append(radio2);
		td6.text(d.b);
		tr3.append(td5);
		tr3.append(td6);

		td7.text("C");
		td7.append(radio3);
		td8.text(d.c);
		tr4.append(td7);
		tr4.append(td8);

		td9.text("D");
		td9.append(radio4);
		td10.text(d.d);
		tr5.append(td9);
		tr5.append(td10);

		table.append(tr1);
		table.append(tr2);
		table.append(tr3);
		table.append(tr4);
		table.append(tr5);
		$('#getTableSetByJS').append(table);
	})
	
}
