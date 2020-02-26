package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

/* renamed from: dei */
/* compiled from: PG */
public final class dei {

    /* renamed from: a */
    public static final deg f8374a = new deg((byte) 0);

    /* renamed from: b */
    private static final def f8375b = new def((byte) 0);

    /* renamed from: c */
    private static final deb f8376c = new deb((byte) 0);

    /* renamed from: d */
    private static final Interpolator f8377d = new AccelerateInterpolator(2.0f);

    /* renamed from: e */
    private static final Interpolator f8378e = new DecelerateInterpolator(3.0f);

    /* renamed from: a */
    public static void m6238a(List list, Animator animator) {
        if (animator != null) {
            list.add(animator);
        }
    }

    /* renamed from: c */
    public static Animator m6242c(View view, float f, float f2, Interpolator interpolator) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, f, f2);
        m6236a(ofFloat, interpolator);
        return ofFloat;
    }

    /* renamed from: a */
    public static Animator m6229a(View view, int i, int i2, Interpolator interpolator) {
        if (i == i2) {
            return null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, new dea(i, i2), 0.0f, 1.0f);
        m6236a(ofFloat, interpolator);
        return ofFloat;
    }

    /* renamed from: a */
    public static Animator m6232a(View view, Rect rect, Rect rect2, Interpolator interpolator) {
        if (rect.equals(rect2)) {
            return null;
        }
        ObjectAnimator ofObject = ObjectAnimator.ofObject(view, f8376c, new dee((byte) 0), rect, rect2);
        m6236a(ofObject, interpolator);
        return ofObject;
    }

    /* renamed from: a */
    public static Animator m6233a(ImageView imageView, float f, float f2, Interpolator interpolator) {
        if (Math.abs(f - f2) <= 0.001f) {
            return null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, new dec(), f, f2);
        m6236a(ofFloat, interpolator);
        return ofFloat;
    }

    /* renamed from: a */
    public static Animator m6226a(View view, int i, int i2, float f) {
        Interpolator interpolator;
        Animator e = m6246e(view, i, i2, f, null);
        if (e != null) {
            if (i2 != 0) {
                interpolator = f8378e;
            } else {
                interpolator = f8377d;
            }
            e.setInterpolator(interpolator);
        }
        return e;
    }

    /* renamed from: b */
    public static Animator m6239b(View view, float f, float f2, Interpolator interpolator) {
        if (Math.abs(f - f2) <= 0.001f) {
            return null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, f8375b, f, f2);
        m6236a(ofFloat, interpolator);
        return ofFloat;
    }

    /* renamed from: a */
    public static Animator m6225a(View view, float f, float f2, Interpolator interpolator) {
        if (f == f2) {
            return null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, f8374a, f, f2);
        m6236a(ofFloat, interpolator);
        return ofFloat;
    }

    /* renamed from: a */
    public static Animator m6230a(View view, Rect rect, Rect rect2, float f, float f2, Interpolator interpolator) {
        float width = ((float) rect.width()) * f;
        if (rect.width() <= 0 || rect2.width() <= 0 || Math.abs(width - ((float) rect2.width())) <= 0.001f) {
            return null;
        }
        view.setPivotX(0.0f);
        view.setPivotY(f2);
        int width2 = rect2.width();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, f8374a, width / ((float) width2), 1.0f);
        m6236a(ofFloat, interpolator);
        return ofFloat;
    }

    /* renamed from: a */
    public static Animator m6231a(View view, Rect rect, Rect rect2, float f, Interpolator interpolator) {
        return m6230a(view, rect, rect2, f, 0.0f, interpolator);
    }

    /* renamed from: a */
    public static Animator m6227a(View view, int i, int i2, float f, Interpolator interpolator) {
        float f2 = ((float) i) * f;
        if (i <= 0 || i2 <= 0) {
            return null;
        }
        float f3 = (float) i2;
        if (Math.abs(f2 - f3) <= 0.001f) {
            return null;
        }
        view.setPivotX(0.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.SCALE_X, f2 / f3, 1.0f);
        m6236a(ofFloat, interpolator);
        return ofFloat;
    }

    /* renamed from: b */
    public static Animator m6240b(View view, int i, int i2, float f, Interpolator interpolator) {
        float f2 = ((float) i) * f;
        if (i <= 0 || i2 <= 0) {
            return null;
        }
        float f3 = (float) i2;
        if (Math.abs(f2 - f3) <= 0.001f) {
            return null;
        }
        view.setPivotY(0.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.SCALE_Y, f2 / f3, 1.0f);
        m6236a(ofFloat, interpolator);
        return ofFloat;
    }

    /* renamed from: a */
    public static Animator m6234a(TextView textView, int i, int i2, Interpolator interpolator) {
        if (i == i2) {
            return null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, new deh(i, i2), 0.0f, 1.0f);
        m6236a(ofFloat, interpolator);
        return ofFloat;
    }

    /* renamed from: a */
    private static Animator m6223a(View view, float f, float f2, float f3, Property property, Interpolator interpolator) {
        float f4 = (f - f2) + f3;
        if (f4 == 0.0f) {
            return null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, f4, 0.0f);
        m6236a(ofFloat, interpolator);
        return ofFloat;
    }

    /* renamed from: c */
    public static Animator m6243c(View view, int i, int i2, float f, Interpolator interpolator) {
        return m6223a(view, (float) i, (float) i2, f, View.TRANSLATION_X, interpolator);
    }

    /* renamed from: b */
    public static Animator m6241b(View view, Rect rect, Rect rect2, float f, Interpolator interpolator) {
        return m6223a(view, (float) rect.left, (float) rect2.left, f, View.TRANSLATION_X, interpolator);
    }

    /* renamed from: a */
    public static Animator m6228a(View view, int i, int i2, int i3, int i4, float f, float f2, Interpolator interpolator) {
        View view2 = view;
        Interpolator interpolator2 = interpolator;
        Animator a = m6223a(view2, (float) i, (float) i3, f, View.TRANSLATION_X, interpolator2);
        Animator a2 = m6223a(view2, (float) i2, (float) i4, f2, View.TRANSLATION_Y, interpolator2);
        if (a == null) {
            return a2;
        }
        if (a2 == null) {
            return a;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(a, a2);
        return animatorSet;
    }

    /* renamed from: d */
    public static Animator m6245d(View view, int i, int i2, float f, Interpolator interpolator) {
        return m6223a(view, (float) i, (float) i2, f, View.TRANSLATION_Y, interpolator);
    }

    /* renamed from: c */
    public static Animator m6244c(View view, Rect rect, Rect rect2, float f, Interpolator interpolator) {
        return m6223a(view, (float) rect.top, (float) rect2.top, f, View.TRANSLATION_Y, interpolator);
    }

    /* renamed from: a */
    public static Animator m6224a(View view, float f, float f2, float f3, Interpolator interpolator) {
        return m6223a(view, f, f2, f3, View.TRANSLATION_Z, interpolator);
    }

    /* renamed from: e */
    public static Animator m6246e(View view, int i, int i2, float f, Interpolator interpolator) {
        if (i2 != 0) {
            if (i == 0 || f != 1.0f) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, f, 0.0f);
                m6236a(ofFloat, interpolator);
                ofFloat.addListener(new ddy(view));
                return ofFloat;
            } else if (i2 != 0) {
                return null;
            }
        }
        if (i == 0 && f == 1.0f) {
            return null;
        }
        if (f == 1.0f) {
            f = 0.0f;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, f, 1.0f);
        m6236a(ofFloat2, interpolator);
        ofFloat2.addListener(new ddz(view));
        return ofFloat2;
    }

    /* renamed from: a */
    public static Rect m6235a(View view) {
        return new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    /* renamed from: a */
    public static void m6237a(View view, Rect rect) {
        view.offsetLeftAndRight(rect.left - view.getLeft());
        view.offsetTopAndBottom(rect.top - view.getTop());
        view.setRight(rect.right);
        view.setBottom(rect.bottom);
    }

    /* renamed from: a */
    private static void m6236a(Animator animator, Interpolator interpolator) {
        if (animator != null && interpolator != null) {
            animator.setInterpolator(interpolator);
        }
    }
}
