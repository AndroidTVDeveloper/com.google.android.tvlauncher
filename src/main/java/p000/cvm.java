package p000;

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

/* renamed from: cvm */
/* compiled from: PG */
public final class cvm {

    /* renamed from: a */
    public static final Map f7688a = new LinkedHashMap(18);

    /* renamed from: b */
    private static final Set f7689b = new HashSet(7);

    /* renamed from: c */
    private static final Map f7690c = new HashMap(18);

    static {
        f7688a.put("input_type_combined_tuners", -3);
        f7688a.put("input_type_tuner", 0);
        f7688a.put("input_type_cec_device_tv", -8);
        f7688a.put("input_type_cec_recorder", -4);
        f7688a.put("input_type_cec_tuner", -10);
        f7688a.put("input_type_cec_playback", -5);
        f7688a.put("input_type_cec_audio_system", -9);
        f7688a.put("input_type_cec_logical", -2);
        f7688a.put("input_type_mhl_mobile", -6);
        f7688a.put("input_type_hdmi", 1007);
        f7688a.put("input_type_dvi", 1006);
        f7688a.put("input_type_component", 1004);
        f7688a.put("input_type_svideo", 1002);
        f7688a.put("input_type_composite", 1001);
        f7688a.put("input_type_displayport", 1008);
        f7688a.put("input_type_vga", 1005);
        f7688a.put("input_type_scart", 1003);
        f7688a.put("input_type_other", 1000);
        f7689b.add(-8);
        f7689b.add(-4);
        f7689b.add(-10);
        f7689b.add(-5);
        f7689b.add(-9);
        f7689b.add(-2);
        f7689b.add(-6);
        f7690c.put(-4, Integer.valueOf((int) R.drawable.ic_icon_32dp_recording));
        f7690c.put(-5, Integer.valueOf((int) R.drawable.ic_icon_32dp_playback));
        Map map = f7690c;
        Integer valueOf = Integer.valueOf((int) R.drawable.ic_icon_32dp_tuner);
        map.put(-2, valueOf);
        f7690c.put(-8, Integer.valueOf((int) R.drawable.ic_icon_32dp_livetv));
        f7690c.put(-9, Integer.valueOf((int) R.drawable.ic_icon_32dp_audio));
        f7690c.put(-10, valueOf);
        f7690c.put(-6, Integer.valueOf((int) R.drawable.ic_icon_32dp_mhl));
        Map map2 = f7690c;
        Integer valueOf2 = Integer.valueOf((int) R.drawable.ic_icon_32dp_hdmi);
        map2.put(1007, valueOf2);
        f7690c.put(-7, Integer.valueOf((int) R.drawable.ic_home_input_black_24dp));
        f7690c.put(-3, valueOf);
        f7690c.put(0, valueOf);
        f7690c.put(1006, Integer.valueOf((int) R.drawable.ic_icon_32dp_dvi));
        f7690c.put(1004, Integer.valueOf((int) R.drawable.ic_icon_32dp_component));
        f7690c.put(1002, Integer.valueOf((int) R.drawable.ic_icon_32dp_svideo));
        f7690c.put(1001, Integer.valueOf((int) R.drawable.ic_icon_32dp_composite));
        f7690c.put(1008, Integer.valueOf((int) R.drawable.ic_icon_32dp_display_port));
        f7690c.put(1005, Integer.valueOf((int) R.drawable.ic_icon_32dp_vga));
        f7690c.put(1003, Integer.valueOf((int) R.drawable.ic_icon_32dp_scart));
        f7690c.put(1000, valueOf2);
    }

    /* renamed from: a */
    static Integer m5750a(int i) {
        return (Integer) f7690c.get(Integer.valueOf(i));
    }

    /* renamed from: a */
    public static cvl m5749a(Context context) {
        if (!dck.m6123a(context).f8228e.f8279n) {
            return cwe.m5770a(context.getApplicationContext());
        }
        Context applicationContext = context.getApplicationContext();
        if (cvf.f7625c == null) {
            cvf.f7625c = new cvf(applicationContext.getApplicationContext());
        }
        return cvf.f7625c;
    }

    /* renamed from: a */
    static Map m5751a(List list) {
        HashMap hashMap = new HashMap(f7688a.size());
        hashMap.put(-7, 0);
        int size = list.size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            Integer num = (Integer) f7688a.get((String) list.get(i2));
            if (num != null && !f7689b.contains(num)) {
                hashMap.put(num, Integer.valueOf(i));
                i++;
            }
        }
        for (Map.Entry value : f7688a.entrySet()) {
            Integer num2 = (Integer) value.getValue();
            if (!hashMap.containsKey(num2) && !f7689b.contains(num2)) {
                hashMap.put(num2, Integer.valueOf(i));
                i++;
            }
        }
        int intValue = ((Integer) hashMap.get(1007)).intValue();
        for (Integer put : f7689b) {
            hashMap.put(put, Integer.valueOf(intValue));
        }
        return hashMap;
    }

    /* renamed from: b */
    public static void m5752b(Context context) {
        Intent intent = new Intent("com.android.tv.action.VIEW_INPUTS");
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 131072);
        intent.setPackage(context.getPackageName());
        if (queryIntentActivities.size() > 1) {
            Iterator<ResolveInfo> it = queryIntentActivities.iterator();
            while (true) {
                if (it.hasNext()) {
                    ResolveInfo next = it.next();
                    if (next.activityInfo != null && !context.getPackageName().equals(next.activityInfo.packageName) && dej.m6251a(next)) {
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
