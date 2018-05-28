package com.test.lijingjing.mytestapplication;

import java.util.Calendar;

/**
 * Created by Li Jing Jing on 2018/05/26.
 */

public interface DateTimeInterpreter {
    String interpretDate(Calendar date);

    String interpretTime(int hour);

    String interpretWeek(int date);
}
