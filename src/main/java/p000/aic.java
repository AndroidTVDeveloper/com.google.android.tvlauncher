package p000;

import android.support.p002v7.widget.RecyclerView;
import android.text.TextUtils;
import android.widget.EdgeEffect;
import java.util.Collection;

/* renamed from: aic */
/* compiled from: PG */
public class aic {
    /* renamed from: c */
    public static /* synthetic */ String m547c(int i) {
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

    /* renamed from: a */
    public void mo310a() {
    }

    /* renamed from: a */
    public void mo311a(int i) {
    }

    /* renamed from: a */
    public void mo312a(int i, int i2) {
    }

    /* renamed from: a */
    public void mo313a(int i, int i2, Object obj) {
    }

    /* renamed from: b */
    public void mo314b(int i) {
    }

    /* renamed from: a */
    public static EdgeEffect m541a(RecyclerView recyclerView) {
        return new EdgeEffect(recyclerView.getContext());
    }

    /* renamed from: a */
    public static void m546a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    public static String m544a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    /* renamed from: a */
    public static Collection m545a(Collection collection) {
        if (!collection.isEmpty()) {
            return collection;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    /* renamed from: a */
    public static Object m542a(Object obj) {
        return m543a(obj, "Argument must not be null");
    }

    /* renamed from: a */
    public static Object m543a(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }
}
