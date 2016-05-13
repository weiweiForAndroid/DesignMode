package com.totiming.designmode.builder;

/**
 * author：supershook on 2016/5/12 19:01
 */
public abstract class  Computer {
    /**
     * 主板
     */
    protected String mBord;
    /**
     * 显示器
     */
    protected String mDisplay;
    /**
     * 操作系统
     */
    protected String mOS;

    public String getmBord() {
        return mBord;
    }

    public void setmBord(String mBord) {
        this.mBord = mBord;
    }

    public void setmOS(String mOS) {
        this.mOS = mOS;
    }

    public void setmDisplay(String mDisplay) {
        this.mDisplay = mDisplay;
    }

    public String getmDisplay() {

        return mDisplay;
    }

    public String getmOS() {
        return mOS;
    }

    @Override
    public String toString() {
        return mBord+"主板/"+mDisplay+"显示器/"+mOS+"系统";
    }
}
