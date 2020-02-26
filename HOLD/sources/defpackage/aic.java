package defpackage;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.widget.EdgeEffect;
import java.util.Collection;

/* renamed from: aic  reason: default package */
/* compiled from: PG */
public class aic {
    public static /* synthetic */ String c(int i) {
        switch (i) {
            case 1:
                return "INITIALIZE";
            case 2:
                return "RESOURCE_CACHE";
            case 3:
                return "DATA_CACHE";
            case 4:
                return "SOURCE";
            case 5:
                return "ENCODE";
            case 6:
                return "FINISHED";
            default:
                return "null";
        }
    }

    public void a() {
    }

    public void a(int i) {
    }

    public void a(int i, int i2) {
    }

    public void a(int i, int i2, Object obj) {
    }

    public void b(int i) {
    }

    public static EdgeEffect a(RecyclerView recyclerView) {
        return new EdgeEffect(recyclerView.getContext());
    }

    public static void a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static String a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    public static Collection a(Collection collection) {
        if (!collection.isEmpty()) {
            return collection;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    public static Object a(Object obj) {
        return a(obj, "Argument must not be null");
    }

    public static Object a(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }
}
