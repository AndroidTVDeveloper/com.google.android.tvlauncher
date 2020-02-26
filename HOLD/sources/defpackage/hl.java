package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: hl  reason: default package */
/* compiled from: PG */
final class hl {
    private static final RectF i = new RectF();
    private static final ConcurrentHashMap j = new ConcurrentHashMap();
    public int a = 0;
    public boolean b = false;
    public float c = -1.0f;
    public float d = -1.0f;
    public float e = -1.0f;
    public int[] f = new int[0];
    public boolean g = false;
    public final Context h;
    private TextPaint k;
    private final TextView l;

    static {
        new ConcurrentHashMap();
    }

    public hl(TextView textView) {
        this.l = textView;
        this.h = textView.getContext();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: hl.a(java.lang.Object, java.lang.String, java.lang.Object):java.lang.Object
     arg types: [android.widget.TextView, java.lang.String, boolean]
     candidates:
      hl.a(float, float, float):void
      hl.a(java.lang.Object, java.lang.String, java.lang.Object):java.lang.Object */
    /* access modifiers changed from: package-private */
    public final void f() {
        boolean z;
        int i2;
        TextDirectionHeuristic textDirectionHeuristic;
        if (g()) {
            if (this.b) {
                if (this.l.getMeasuredHeight() > 0 && this.l.getMeasuredWidth() > 0) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        z = this.l.isHorizontallyScrollable();
                    } else {
                        z = ((Boolean) a((Object) this.l, "getHorizontallyScrolling", (Object) false)).booleanValue();
                    }
                    if (!z) {
                        i2 = (this.l.getMeasuredWidth() - this.l.getTotalPaddingLeft()) - this.l.getTotalPaddingRight();
                    } else {
                        i2 = 1048576;
                    }
                    int height = (this.l.getHeight() - this.l.getCompoundPaddingBottom()) - this.l.getCompoundPaddingTop();
                    if (i2 > 0 && height > 0) {
                        synchronized (i) {
                            i.setEmpty();
                            i.right = (float) i2;
                            i.bottom = (float) height;
                            RectF rectF = i;
                            int length = this.f.length;
                            if (length != 0) {
                                int i3 = length - 1;
                                int i4 = 0;
                                int i5 = 1;
                                while (i5 <= i3) {
                                    int i6 = (i5 + i3) / 2;
                                    int i7 = this.f[i6];
                                    CharSequence text = this.l.getText();
                                    TransformationMethod transformationMethod = this.l.getTransformationMethod();
                                    if (transformationMethod != null) {
                                        CharSequence transformation = transformationMethod.getTransformation(text, this.l);
                                        if (transformation != null) {
                                            text = transformation;
                                        }
                                    }
                                    int i8 = Build.VERSION.SDK_INT;
                                    int maxLines = this.l.getMaxLines();
                                    TextPaint textPaint = this.k;
                                    if (textPaint == null) {
                                        this.k = new TextPaint();
                                    } else {
                                        textPaint.reset();
                                    }
                                    this.k.set(this.l.getPaint());
                                    this.k.setTextSize((float) i7);
                                    int round = Math.round(rectF.right);
                                    int i9 = Build.VERSION.SDK_INT;
                                    StaticLayout.Builder obtain = StaticLayout.Builder.obtain(text, 0, text.length(), this.k, round);
                                    obtain.setAlignment((Layout.Alignment) a(this.l, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL)).setLineSpacing(this.l.getLineSpacingExtra(), this.l.getLineSpacingMultiplier()).setIncludePad(this.l.getIncludeFontPadding()).setBreakStrategy(this.l.getBreakStrategy()).setHyphenationFrequency(this.l.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines);
                                    try {
                                        if (Build.VERSION.SDK_INT < 29) {
                                            textDirectionHeuristic = (TextDirectionHeuristic) a(this.l, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
                                        } else {
                                            textDirectionHeuristic = this.l.getTextDirectionHeuristic();
                                        }
                                        obtain.setTextDirection(textDirectionHeuristic);
                                    } catch (ClassCastException e2) {
                                        Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
                                    }
                                    StaticLayout build = obtain.build();
                                    if (maxLines != -1) {
                                        if (build.getLineCount() <= maxLines) {
                                            if (build.getLineEnd(build.getLineCount() - 1) != text.length()) {
                                            }
                                        }
                                        i4 = i6 - 1;
                                        i3 = i4;
                                    }
                                    if (((float) build.getHeight()) <= rectF.bottom) {
                                        int i10 = i5;
                                        i5 = i6 + 1;
                                        i4 = i10;
                                    }
                                    i4 = i6 - 1;
                                    i3 = i4;
                                }
                                float f2 = (float) this.f[i4];
                                if (f2 != this.l.getTextSize()) {
                                    a(0, f2);
                                }
                            } else {
                                throw new IllegalStateException("No available text sizes to choose from.");
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.b = true;
        }
    }

    public static final int[] a(int[] iArr) {
        if (r0 != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i2 : iArr) {
                if (i2 > 0) {
                    Integer valueOf = Integer.valueOf(i2);
                    if (Collections.binarySearch(arrayList, valueOf) < 0) {
                        arrayList.add(valueOf);
                    }
                }
            }
            if (r0 != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i3 = 0; i3 < size; i3++) {
                    iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    /* access modifiers changed from: package-private */
    public final int c() {
        return Math.round(this.e);
    }

    /* access modifiers changed from: package-private */
    public final int b() {
        return Math.round(this.d);
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        return Math.round(this.c);
    }

    private static Method a(String str) {
        try {
            Method method = (Method) j.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                j.put(str, method);
            }
            return method;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    private static Object a(Object obj, String str, Object obj2) {
        try {
            obj2 = a(str).invoke(obj, new Object[0]);
            if (obj2 != null) {
                return obj2;
            }
            return null;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean g() {
        return h() && this.a != 0;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, float f2) {
        Resources resources;
        Context context = this.h;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i2, f2, resources.getDisplayMetrics());
        if (applyDimension != this.l.getPaint().getTextSize()) {
            this.l.getPaint().setTextSize(applyDimension);
            int i3 = Build.VERSION.SDK_INT;
            boolean isInLayout = this.l.isInLayout();
            if (this.l.getLayout() != null) {
                this.b = false;
                try {
                    Method a2 = a("nullLayouts");
                    if (a2 != null) {
                        a2.invoke(this.l, new Object[0]);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (isInLayout) {
                    this.l.forceLayout();
                } else {
                    this.l.requestLayout();
                }
                this.l.invalidate();
            }
        }
    }

    public final boolean e() {
        if (!h() || this.a != 1) {
            this.b = false;
            return false;
        }
        if (!this.g || this.f.length == 0) {
            int floor = ((int) Math.floor((double) ((this.e - this.d) / this.c))) + 1;
            int[] iArr = new int[floor];
            for (int i2 = 0; i2 < floor; i2++) {
                iArr[i2] = Math.round(this.d + (((float) i2) * this.c));
            }
            this.f = a(iArr);
        }
        this.b = true;
        return true;
    }

    public final boolean d() {
        int[] iArr = this.f;
        int length = iArr.length;
        boolean z = length > 0;
        this.g = z;
        if (z) {
            this.a = 1;
            this.d = (float) iArr[0];
            this.e = (float) iArr[length - 1];
            this.c = -1.0f;
        }
        return z;
    }

    public final boolean h() {
        return !(this.l instanceof hb);
    }

    public final void a(float f2, float f3, float f4) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        } else if (f3 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        } else if (f4 > 0.0f) {
            this.a = 1;
            this.d = f2;
            this.e = f3;
            this.c = f4;
            this.g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        }
    }
}
