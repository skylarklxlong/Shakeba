package com.bihe0832.shakeba.framework.common;import com.bihe0832.shakeba.libware.file.Logger;/** * @author hardyshi 2014-09-1 * 公告类型宏 */public enum eGAME {	DICE(1),  	ADVENTURE(2),	DIVINE(3),	HOME(4),	EXAM(5),	LOVER(6),	STONE(7),	PLANK(8);  	    int value = 0;        eGAME(int val) {        this.value = val;    }        static public eGAME getEnum(int i) {    	eGAME type = null;        switch (i) {            case 1:                // 骰子                type = eGAME.DICE;                break;            case 2:                // 真心话大冒险                type = eGAME.ADVENTURE;                break;            case 3:                // 算命                type = eGAME.DIVINE;                break;            case 4:                // 做家务                type = eGAME.HOME;                break;            case 5:                // 考试ABCD                type = eGAME.EXAM;                break;            case 6:                // 秀恩爱                type = eGAME.LOVER;                break;            case 7:                // 石头剪刀布                type = eGAME.STONE;                break;            case 8:                // 平板支撑                type = eGAME.PLANK;                break;            default:            	Logger.e("bad game type:"+i);            	type = eGAME.DICE;                break;        }        return type;    }        public int val() {    	return value;    }}