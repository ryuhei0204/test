//日時を取得・表示させるためのクラス
package com.internousdev.template.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public String getDate(){
		//現在日時の取得
		Date date=new Date();
		//書式の設定yyyy年MM月dd日HH時mm分ss秒
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		return simpleDateFormat.format(date);
	}


}
