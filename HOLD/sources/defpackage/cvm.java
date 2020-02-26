package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.tvlauncher.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: cvm  reason: default package */
/* compiled from: PG */
public final class cvm {
    public static final Map a = new LinkedHashMap(18);
    private static final Set b = new HashSet(7);
    private static final Map c = new HashMap(18);

    static {
        a.put("input_type_combined_tuners", -3);
        a.put("input_type_tuner", 0);
        a.put("input_type_cec_device_tv", -8);
        a.put("input_type_cec_recorder", -4);
        a.put("input_type_cec_tuner", -10);
        a.put("input_type_cec_playback", -5);
        a.put("input_type_cec_audio_system", -9);
        a.put("input_type_cec_logical", -2);
        a.put("input_type_mhl_mobile", -6);
        a.put("input_type_hdmi", 1007);
        a.put("input_type_dvi", 1006);
        a.put("input_type_component", 1004);
        a.put("input_type_svideo", 1002);
        a.put("input_type_composite", 1001);
        a.put("input_type_displayport", 1008);
        a.put("input_type_vga", 1005);
        a.put("input_type_scart", 1003);
        a.put("input_type_other", 1000);
        b.add(-8);
        b.add(-4);
        b.add(-10);
        b.add(-5);
        b.add(-9);
        b.add(-2);
        b.add(-6);
        c.put(-4, Integer.valueOf((int) R.drawable.ic_icon_32dp_recording));
        c.put(-5, Integer.valueOf((int) R.drawable.ic_icon_32dp_playback));
        Map map = c;
        Integer valueOf = Integer.valueOf((int) R.drawable.ic_icon_32dp_tuner);
        map.put(-2, valueOf);
        c.put(-8, Integer.valueOf((int) R.drawable.ic_icon_32dp_livetv));
        c.put(-9, Integer.valueOf((int) R.drawable.ic_icon_32dp_audio));
        c.put(-10, valueOf);
        c.put(-6, Integer.valueOf((int) R.drawable.ic_icon_32dp_mhl));
        Map map2 = c;
        Integer valueOf2 = Integer.valueOf((int) R.drawable.ic_icon_32dp_hdmi);
        map2.put(1007, valueOf2);
        c.put(-7, Integer.valueOf((int) R.drawable.ic_home_input_black_24dp));
        c.put(-3, valueOf);
        c.put(0, valueOf);
        c.put(1006, Integer.valueOf((int) R.drawable.ic_icon_32dp_dvi));
        c.put(1004, Integer.valueOf((int) R.drawable.ic_icon_32dp_component));
        c.put(1002, Integer.valueOf((int) R.drawable.ic_icon_32dp_svideo));
        c.put(1001, Integer.valueOf((int) R.drawable.ic_icon_32dp_composite));
        c.put(1008, Integer.valueOf((int) R.drawable.ic_icon_32dp_display_port));
        c.put(1005, Integer.valueOf((int) R.drawable.ic_icon_32dp_vga));
        c.put(1003, Integer.valueOf((int) R.drawable.ic_icon_32dp_scart));
        c.put(1000, valueOf2);
    }

    static Integer a(int i) {
        return (Integer) c.get(Integer.valueOf(i));
    }

    public static cvl a(Context context) {
        if (!dck.a(context).e.n) {
            return cwe.a(context.getApplicationContext());
        }
        Context applicationContext = context.getApplicationContext();
        if (cvf.c == null) {
            cvf.c = new cvf(applicationContext.getApplicationContext());
        }
        return cvf.c;
    }

    static Map a(List list) {
        HashMap hashMap = new HashMap(a.size());
        hashMap.put(-7, 0);
        int size = list.size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            Integer num = (Integer) a.get((String) list.get(i2));
            if (num != null && !b.contains(num)) {
                hashMap.put(num, Integer.valueOf(i));
                i++;
            }
        }
        for (Map.Entry value : a.entrySet()) {
            Integer num2 = (Integer) value.getValue();
            if (!hashMap.containsKey(num2) && !b.contains(num2)) {
                hashMap.put(num2, Integer.valueOf(i));
                i++;
            }
        }
        int intValue = ((Integer) hashMap.get(1007)).intValue();
        for (Integer put : b) {
            hashMap.put(put, Integer.valueOf(intValue));
        }
        return hashMap;
    }

    public static void b(Context context) {
        Intent intent = new Intent("com.android.tv.action.VIEW_INPUTS");
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 131072);
        intent.setPackage(context.getPackageName());
        if (queryIntentActivities.size() > 1) {
            Iterator<ResolveInfo> it = queryIntentActivities.iterator();
            while (true) {
                if (it.hasNext()) {
                    ResolveInfo next = it.next();
                    if (next.activityInfo != null && !context.getPackageName().equals(next.activityInfo.packageName) && dej.a(next)) {
                        intent.setPackage(next.activityInfo.packageName);
                        break;
                    }
                }
            }
        }
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            Log.e("InputsManagerUtil", "Inputs activity not found", e);
        }
    }
}
