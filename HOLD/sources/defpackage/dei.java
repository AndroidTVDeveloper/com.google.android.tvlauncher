package defpackage;

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

/* renamed from: dei  reason: default package */
/* compiled from: PG */
public final class dei {
    public static final deg a = new deg((byte) 0);
    private static final def b = new def((byte) 0);
    private static final deb c = new deb((byte) 0);
    private static final Interpolator d = new AccelerateInterpolator(2.0f);
    private static final Interpolator e = new DecelerateInterpolator(3.0f);

    public static void a(List list, Animator animator) {
        if (animator != null) {
            list.add(animator);
        }
    }

    public static Animator c(View view, float f, float f2, Interpolator interpolator) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, f, f2);
        a(ofFloat, interpolator);
        return ofFloat;
    }

    public static Animator a(View view, int i, int i2, Interpolator interpolator) {
        if (i == i2) {
            return null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, new dea(i, i2), 0.0f, 1.0f);
        a(ofFloat, interpolator);
        return ofFloat;
    }

    public static Animator a(View view, Rect rect, Rect rect2, Interpolator interpolator) {
        if (rect.equals(rect2)) {
            return null;
        }
        ObjectAnimator ofObject = ObjectAnimator.ofObject(view, c, new dee((byte) 0), rect, rect2);
        a(ofObject, interpolator);
        return ofObject;
    }

    public static Animator a(ImageView imageView, float f, float f2, Interpolator interpolator) {
        if (Math.abs(f - f2) <= 0.001f) {
            return null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, new dec(), f, f2);
        a(ofFloat, interpolator);
        return ofFloat;
    }

    public static Animator a(View view, int i, int i2, float f) {
        Interpolator interpolator;
        Animator e2 = e(view, i, i2, f, null);
        if (e2 != null) {
            if (i2 != 0) {
                interpolator = e;
            } else {
                interpolator = d;
            }
            e2.setInterpolator(interpolator);
        }
        return e2;
    }

    public static Animator b(View view, float f, float f2, Interpolator interpolator) {
        if (Math.abs(f - f2) <= 0.001f) {
            return null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, b, f, f2);
        a(ofFloat, interpolator);
        return ofFloat;
    }

    public static Animator a(View view, float f, float f2, Interpolator interpolator) {
        if (f == f2) {
            return null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, a, f, f2);
        a(ofFloat, interpolator);
        return ofFloat;
    }

    public static Animator a(View view, Rect rect, Rect rect2, float f, float f2, Interpolator interpolator) {
        float width = ((float) rect.width()) * f;
        if (rect.width() <= 0 || rect2.width() <= 0 || Math.abs(width - ((float) rect2.width())) <= 0.001f) {
            return null;
        }
        view.setPivotX(0.0f);
        view.setPivotY(f2);
        int width2 = rect2.width();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, a, width / ((float) width2), 1.0f);
        a(ofFloat, interpolator);
        return ofFloat;
    }

    public static Animator a(View view, Rect rect, Rect rect2, float f, Interpolator interpolator) {
        return a(view, rect, rect2, f, 0.0f, interpolator);
    }

    public static Animator a(View view, int i, int i2, float f, Interpolator interpolator) {
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
        a(ofFloat, interpolator);
        return ofFloat;
    }

    public static Animator b(View view, int i, int i2, float f, Interpolator interpolator) {
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
        a(ofFloat, interpolator);
        return ofFloat;
    }

    public static Animator a(TextView textView, int i, int i2, Interpolator interpolator) {
        if (i == i2) {
            return null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, new deh(i, i2), 0.0f, 1.0f);
        a(ofFloat, interpolator);
        return ofFloat;
    }

    private static Animator a(View view, float f, float f2, float f3, Property property, Interpolator interpolator) {
        float f4 = (f - f2) + f3;
        if (f4 == 0.0f) {
            return null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, f4, 0.0f);
        a(ofFloat, interpolator);
        return ofFloat;
    }

    public static Animator c(View view, int i, int i2, float f, Interpolator interpolator) {
        return a(view, (float) i, (float) i2, f, View.TRANSLATION_X, interpolator);
    }

    public static Animator b(View view, Rect rect, Rect rect2, float f, Interpolator interpolator) {
        return a(view, (float) rect.left, (float) rect2.left, f, View.TRANSLATION_X, interpolator);
    }

    public static Animator a(View view, int i, int i2, int i3, int i4, float f, float f2, Interpolator interpolator) {
        View view2 = view;
        Interpolator interpolator2 = interpolator;
        Animator a2 = a(view2, (float) i, (float) i3, f, View.TRANSLATION_X, interpolator2);
        Animator a3 = a(view2, (float) i2, (float) i4, f2, View.TRANSLATION_Y, interpolator2);
        if (a2 == null) {
            return a3;
        }
        if (a3 == null) {
            return a2;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(a2, a3);
        return animatorSet;
    }

    public static Animator d(View view, int i, int i2, float f, Interpolator interpolator) {
        return a(view, (float) i, (float) i2, f, View.TRANSLATION_Y, interpolator);
    }

    public static Animator c(View view, Rect rect, Rect rect2, float f, Interpolator interpolator) {
        return a(view, (float) rect.top, (float) rect2.top, f, View.TRANSLATION_Y, interpolator);
    }

    public static Animator a(View view, float f, float f2, float f3, Interpolator interpolator) {
        return a(view, f, f2, f3, View.TRANSLATION_Z, interpolator);
    }

    public static Animator e(View view, int i, int i2, float f, Interpolator interpolator) {
        if (i2 != 0) {
            if (i == 0 || f != 1.0f) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, f, 0.0f);
                a(ofFloat, interpolator);
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
        a(ofFloat2, interpolator);
        ofFloat2.addListener(new ddz(view));
        return ofFloat2;
    }

    public static Rect a(View view) {
        return new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public static void a(View view, Rect rect) {
        view.offsetLeftAndRight(rect.left - view.getLeft());
        view.offsetTopAndBottom(rect.top - view.getTop());
        view.setRight(rect.right);
        view.setBottom(rect.bottom);
    }

    private static void a(Animator animator, Interpolator interpolator) {
        if (animator != null && interpolator != null) {
            animator.setInterpolator(interpolator);
        }
    }
}
