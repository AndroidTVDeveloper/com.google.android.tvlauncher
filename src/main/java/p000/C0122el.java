package p000;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewParent;
import android.widget.EdgeEffect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executors;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: el */
/* compiled from: PG */
public class C0122el {
    public C0122el(byte b) {
        Executors.newFixedThreadPool(4, new C0028b());
    }

    public C0122el() {
    }

    /* renamed from: a */
    public static List m7246a(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() != 0) {
                ArrayList arrayList = new ArrayList();
                int i2 = Build.VERSION.SDK_INT;
                if (obtainTypedArray.getType(0) != 1) {
                    arrayList.add(m7247a(resources.getStringArray(i)));
                } else {
                    for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                        int resourceId = obtainTypedArray.getResourceId(i3, 0);
                        if (resourceId != 0) {
                            arrayList.add(m7247a(resources.getStringArray(resourceId)));
                        }
                    }
                }
                return arrayList;
            }
            List emptyList = Collections.emptyList();
            obtainTypedArray.recycle();
            return emptyList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: a */
    public static void m7252a(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* renamed from: a */
    private static List m7247a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Shader.TileMode m7245a(int i) {
        if (i == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i != 2) {
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.MIRROR;
    }

    /* renamed from: a */
    public static int m7244a(int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        return Gravity.getAbsoluteGravity(i, i2);
    }

    /* renamed from: a */
    public static boolean m7254a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        int i = Build.VERSION.SDK_INT;
        try {
            return viewParent.onNestedFling(view, f, f2, z);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e);
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m7253a(ViewParent viewParent, View view, float f, float f2) {
        int i = Build.VERSION.SDK_INT;
        try {
            return viewParent.onNestedPreFling(view, f, f2);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e);
            return false;
        }
    }

    /* renamed from: a */
    public static void m7250a(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof C0097dn) {
            ((C0097dn) viewParent).mo690a(i, i2, iArr, i3);
        } else if (i3 == 0) {
            int i4 = Build.VERSION.SDK_INT;
            try {
                viewParent.onNestedPreScroll(view, i, i2, iArr);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e);
            }
        }
    }

    /* renamed from: a */
    public static void m7249a(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewParent viewParent2 = viewParent;
        if (viewParent2 instanceof C0098do) {
            ((C0098do) viewParent2).mo692a(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent2 instanceof C0097dn) {
            ((C0097dn) viewParent2).mo691a(view, i, i2, i3, i4, i5);
        } else if (i5 == 0) {
            int i6 = Build.VERSION.SDK_INT;
            try {
                viewParent.onNestedScroll(view, i, i2, i3, i4);
            } catch (AbstractMethodError e) {
                AbstractMethodError abstractMethodError = e;
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", abstractMethodError);
            }
        }
    }

    /* renamed from: b */
    public static void m7256b(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof C0097dn) {
            ((C0097dn) viewParent).mo699b(view, view2, i, i2);
        } else if (i2 == 0) {
            int i3 = Build.VERSION.SDK_INT;
            try {
                viewParent.onNestedScrollAccepted(view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e);
            }
        }
    }

    /* renamed from: a */
    public static boolean m7255a(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof C0097dn) {
            return ((C0097dn) viewParent).mo693a(view, view2, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        int i3 = Build.VERSION.SDK_INT;
        try {
            return viewParent.onStartNestedScroll(view, view2, i);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e);
            return false;
        }
    }

    /* renamed from: a */
    public static void m7248a(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof C0097dn) {
            ((C0097dn) viewParent).mo689a(i);
        } else if (i == 0) {
            int i2 = Build.VERSION.SDK_INT;
            try {
                viewParent.onStopNestedScroll(view);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e);
            }
        }
    }

    /* renamed from: a */
    public static void m7251a(EdgeEffect edgeEffect, float f, float f2) {
        int i = Build.VERSION.SDK_INT;
        edgeEffect.onPull(f, f2);
    }
}
