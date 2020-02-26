package p000;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.text.TextUtils;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;
import com.google.android.tvlauncher.R;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: bks */
/* compiled from: PG */
public final class bks {
    public bks(byte b) {
        new CopyOnWriteArrayList();
    }

    public bks() {
        new CopyOnWriteArrayList();
    }

    /* renamed from: a */
    public static Animator m3506a(View view, TransitionValues transitionValues, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator, Transition transition) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) transitionValues.view.getTag(R.id.transitionPosition);
        if (iArr != null) {
            f = ((float) (iArr[0] - i)) + translationX;
            f2 = ((float) (iArr[1] - i2)) + translationY;
        }
        int round = Math.round(f - translationX) + i;
        int round2 = i2 + Math.round(f2 - translationY);
        view.setTranslationX(f);
        view.setTranslationY(f2);
        if (f == f3 && f2 == f4) {
            return null;
        }
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_X, View.TRANSLATION_Y, path);
        C0356nc ncVar = new C0356nc(view, transitionValues.view, round, round2, translationX, translationY);
        transition.addListener(ncVar);
        ofFloat.addListener(ncVar);
        ofFloat.addPauseListener(ncVar);
        ofFloat.setInterpolator(timeInterpolator);
        return ofFloat;
    }

    /* renamed from: a */
    public static void m3510a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public static void m3511a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static void m3509a(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
    }

    /* renamed from: a */
    public static String m3508a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public static Object m3507a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw null;
    }

    /* renamed from: b */
    public static void m3512b(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: b */
    public static void m3513b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException((String) obj);
        }
    }
}
