package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.graphics.ColorFilter;
import org.w3c.dom.Element;

/* renamed from: dej  reason: default package */
/* compiled from: PG */
public class dej {
    public static boolean a(int i) {
        return i == 6 || i == 7 || i == 8 || i == 9 || i == 10 || i == 11 || i == 12;
    }

    public void a() {
    }

    public void a(Element element) {
    }

    public static String b(int i) {
        String str;
        switch (i) {
            case 0:
                str = "DEFAULT";
                break;
            case 1:
                str = "DEFAULT_TOP_ROW_SELECTED";
                break;
            case 2:
                str = "DEFAULT_SYSTEM_BAR_SELECTED";
                break;
            case 3:
                str = "DEFAULT_APPS_ROW_SELECTED";
                break;
            case 4:
                str = "DEFAULT_SELECTED_CHANNEL";
                break;
            case 5:
                str = "DEFAULT_FAST_SCROLLING";
                break;
            case 6:
                str = "ZOOMED_OUT";
                break;
            case 7:
                str = "ZOOMED_OUT_SELECTED_CHANNEL";
                break;
            case 8:
                str = "ZOOMED_OUT_TOP_ROW_SELECTED";
                break;
            case 9:
                str = "CHANNEL_ACTIONS";
                break;
            case 10:
                str = "CHANNEL_ACTIONS_SELECTED_CHANNEL";
                break;
            case 11:
                str = "MOVE_CHANNEL";
                break;
            case 12:
                str = "MOVE_CHANNEL_SELECTED_CHANNEL";
                break;
            case 13:
                str = "DEFAULT_ABOVE_SELECTED_LAST_ROW";
                break;
            default:
                str = null;
                break;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 14);
        sb.append(str);
        sb.append(" (");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    private static boolean a(ApplicationInfo applicationInfo) {
        return (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
    }

    public static boolean a(Context context, String str) {
        try {
            return a(context.getPackageManager().getApplicationInfo(str, 0));
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    public static boolean a(ResolveInfo resolveInfo) {
        return resolveInfo.activityInfo != null && a(resolveInfo.activityInfo.applicationInfo);
    }

    public static int a(int i, float f) {
        float[] fArr = new float[3];
        Color.RGBToHSV(Color.red(i), Color.green(i), Color.blue(i), fArr);
        fArr[2] = fArr[2] * f;
        return Color.HSVToColor(fArr);
    }

    public static ColorFilter b(int i, float f) {
        lz a = lz.a(i);
        if (f < 0.0f || ((double) f) > 1.0d) {
            return null;
        }
        return a.a[(int) (f * 255.0f)];
    }
}
