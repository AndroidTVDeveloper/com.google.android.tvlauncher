package defpackage;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Field;

/* renamed from: ib  reason: default package */
/* compiled from: PG */
public final class ib {
    public static final Rect a = new Rect();
    private static Class b;

    static {
        int i = Build.VERSION.SDK_INT;
        try {
            b = Class.forName("android.graphics.Insets");
        } catch (ClassNotFoundException e) {
        }
    }

    public static boolean b(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = Build.VERSION.SDK_INT;
        if (drawable instanceof DrawableContainer) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
                return true;
            }
            for (Drawable b2 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                if (!b(b2)) {
                    return false;
                }
            }
            return true;
        } else if (drawable instanceof br) {
            return b(((br) drawable).a());
        } else {
            if (drawable instanceof et) {
                return b(((et) drawable).a);
            }
            if (drawable instanceof ScaleDrawable) {
                return b(((ScaleDrawable) drawable).getDrawable());
            }
            return true;
        }
    }

    static void a() {
        int i = Build.VERSION.SDK_INT;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public static Rect a(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 29) {
            Insets opticalInsets = drawable.getOpticalInsets();
            Rect rect = new Rect();
            rect.left = opticalInsets.left;
            rect.right = opticalInsets.right;
            rect.top = opticalInsets.top;
            rect.bottom = opticalInsets.bottom;
            return rect;
        }
        if (b != null) {
            try {
                if (drawable instanceof br) {
                    drawable = ((br) drawable).a();
                }
                Object invoke = drawable.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(drawable, new Object[0]);
                if (invoke != null) {
                    Rect rect2 = new Rect();
                    for (Field field : b.getFields()) {
                        String name = field.getName();
                        char c = 65535;
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    c = 2;
                                    break;
                                }
                                break;
                        }
                        if (c == 0) {
                            rect2.left = field.getInt(invoke);
                        } else if (c == 1) {
                            rect2.top = field.getInt(invoke);
                        } else if (c == 2) {
                            rect2.right = field.getInt(invoke);
                        } else if (c == 3) {
                            rect2.bottom = field.getInt(invoke);
                        }
                    }
                    return rect2;
                }
            } catch (Exception e) {
                Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
            }
        }
        return a;
    }

    public static PorterDuff.Mode a(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
