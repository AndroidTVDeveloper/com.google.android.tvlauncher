package defpackage;

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

/* renamed from: el  reason: default package */
/* compiled from: PG */
public class el {
    public el(byte b) {
        Executors.newFixedThreadPool(4, new b());
    }

    public el() {
    }

    public static List a(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() != 0) {
                ArrayList arrayList = new ArrayList();
                int i2 = Build.VERSION.SDK_INT;
                if (obtainTypedArray.getType(0) != 1) {
                    arrayList.add(a(resources.getStringArray(i)));
                } else {
                    for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                        int resourceId = obtainTypedArray.getResourceId(i3, 0);
                        if (resourceId != 0) {
                            arrayList.add(a(resources.getStringArray(resourceId)));
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

    public static void a(XmlPullParser xmlPullParser) {
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

    private static List a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }

    public static Shader.TileMode a(int i) {
        if (i == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i != 2) {
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.MIRROR;
    }

    public static int a(int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        return Gravity.getAbsoluteGravity(i, i2);
    }

    public static boolean a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        int i = Build.VERSION.SDK_INT;
        try {
            return viewParent.onNestedFling(view, f, f2, z);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e);
            return false;
        }
    }

    public static boolean a(ViewParent viewParent, View view, float f, float f2) {
        int i = Build.VERSION.SDK_INT;
        try {
            return viewParent.onNestedPreFling(view, f, f2);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e);
            return false;
        }
    }

    public static void a(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof dn) {
            ((dn) viewParent).a(i, i2, iArr, i3);
        } else if (i3 == 0) {
            int i4 = Build.VERSION.SDK_INT;
            try {
                viewParent.onNestedPreScroll(view, i, i2, iArr);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e);
            }
        }
    }

    public static void a(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewParent viewParent2 = viewParent;
        if (viewParent2 instanceof C0000do) {
            ((C0000do) viewParent2).a(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent2 instanceof dn) {
            ((dn) viewParent2).a(view, i, i2, i3, i4, i5);
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

    public static void b(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof dn) {
            ((dn) viewParent).b(view, view2, i, i2);
        } else if (i2 == 0) {
            int i3 = Build.VERSION.SDK_INT;
            try {
                viewParent.onNestedScrollAccepted(view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e);
            }
        }
    }

    public static boolean a(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof dn) {
            return ((dn) viewParent).a(view, view2, i, i2);
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

    public static void a(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof dn) {
            ((dn) viewParent).a(i);
        } else if (i == 0) {
            int i2 = Build.VERSION.SDK_INT;
            try {
                viewParent.onStopNestedScroll(view);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e);
            }
        }
    }

    public static void a(EdgeEffect edgeEffect, float f, float f2) {
        int i = Build.VERSION.SDK_INT;
        edgeEffect.onPull(f, f2);
    }
}
