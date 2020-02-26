package androidx.leanback.widget.picker;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.leanback.widget.VerticalGridView;
import com.google.android.tvlauncher.R;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: PG */
public class DatePicker extends C0412pe {

    /* renamed from: g */
    public static final int[] f1300g = {5, 2, 1};

    /* renamed from: a */
    public int f1301a;

    /* renamed from: b */
    public int f1302b;

    /* renamed from: c */
    public int f1303c;

    /* renamed from: d */
    public Calendar f1304d;

    /* renamed from: e */
    public Calendar f1305e;

    /* renamed from: f */
    public Calendar f1306f;

    /* renamed from: p */
    private String f1307p;

    /* renamed from: q */
    private C0413pf f1308q;

    /* renamed from: r */
    private C0413pf f1309r;

    /* renamed from: s */
    private C0413pf f1310s;

    /* renamed from: t */
    private final DateFormat f1311t;

    /* renamed from: u */
    private C0414pg f1312u;

    /* renamed from: v */
    private Calendar f1313v;

    public DatePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.datePickerStyle);
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public DatePicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1311t = new SimpleDateFormat("MM/dd/yyyy");
        Locale locale = Locale.getDefault();
        getContext().getResources();
        C0414pg a = C0415ph.m8183a(locale);
        this.f1312u = a;
        this.f1313v = C0415ph.m8182a(this.f1313v, a.f10142a);
        this.f1304d = C0415ph.m8182a(this.f1304d, this.f1312u.f10142a);
        this.f1305e = C0415ph.m8182a(this.f1305e, this.f1312u.f10142a);
        this.f1306f = C0415ph.m8182a(this.f1306f, this.f1312u.f10142a);
        C0413pf pfVar = this.f1308q;
        if (pfVar != null) {
            pfVar.f10140d = this.f1312u.f10143b;
            mo5734a(this.f1301a, pfVar);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0324ly.f9934d);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, C0324ly.f9934d, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            String string = obtainStyledAttributes.getString(0);
            String string2 = obtainStyledAttributes.getString(1);
            String string3 = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            this.f1313v.clear();
            if (TextUtils.isEmpty(string)) {
                this.f1313v.set(1900, 0, 1);
            } else if (!m1440a(string, this.f1313v)) {
                this.f1313v.set(1900, 0, 1);
            }
            this.f1304d.setTimeInMillis(this.f1313v.getTimeInMillis());
            this.f1313v.clear();
            if (TextUtils.isEmpty(string2)) {
                this.f1313v.set(2100, 0, 1);
            } else if (!m1440a(string2, this.f1313v)) {
                this.f1313v.set(2100, 0, 1);
            }
            this.f1305e.setTimeInMillis(this.f1313v.getTimeInMillis());
            string3 = TextUtils.isEmpty(string3) ? new String(android.text.format.DateFormat.getDateFormatOrder(context)) : string3;
            string3 = TextUtils.isEmpty(string3) ? new String(android.text.format.DateFormat.getDateFormatOrder(getContext())) : string3;
            if (!TextUtils.equals(this.f1307p, string3)) {
                this.f1307p = string3;
                String bestDateTimePattern = android.text.format.DateFormat.getBestDateTimePattern(this.f1312u.f10142a, string3);
                bestDateTimePattern = TextUtils.isEmpty(bestDateTimePattern) ? "MM/dd/yyyy" : bestDateTimePattern;
                ArrayList arrayList = new ArrayList();
                StringBuilder sb = new StringBuilder();
                char[] cArr = {'Y', 'y', 'M', 'm', 'D', 'd'};
                boolean z = false;
                char c = 0;
                for (int i2 = 0; i2 < bestDateTimePattern.length(); i2++) {
                    char charAt = bestDateTimePattern.charAt(i2);
                    if (charAt != ' ') {
                        if (charAt != '\'') {
                            if (z) {
                                sb.append(charAt);
                            } else {
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= 6) {
                                        sb.append(charAt);
                                        break;
                                    } else if (charAt != cArr[i3]) {
                                        i3++;
                                    } else if (charAt != c) {
                                        arrayList.add(sb.toString());
                                        sb.setLength(0);
                                    }
                                }
                            }
                            c = charAt;
                        } else if (z) {
                            z = false;
                        } else {
                            sb.setLength(0);
                            z = true;
                        }
                    }
                }
                arrayList.add(sb.toString());
                if (arrayList.size() == string3.length() + 1) {
                    this.f10133l.clear();
                    this.f10133l.addAll(arrayList);
                    this.f1309r = null;
                    this.f1308q = null;
                    this.f1310s = null;
                    this.f1301a = -1;
                    this.f1302b = -1;
                    this.f1303c = -1;
                    String upperCase = string3.toUpperCase();
                    ArrayList arrayList2 = new ArrayList(3);
                    for (int i4 = 0; i4 < upperCase.length(); i4++) {
                        char charAt2 = upperCase.charAt(i4);
                        if (charAt2 != 'D') {
                            if (charAt2 != 'M') {
                                if (charAt2 != 'Y') {
                                    throw new IllegalArgumentException("datePicker format error");
                                } else if (this.f1310s == null) {
                                    C0413pf pfVar2 = new C0413pf();
                                    this.f1310s = pfVar2;
                                    arrayList2.add(pfVar2);
                                    this.f1303c = i4;
                                    this.f1310s.f10141e = "%d";
                                } else {
                                    throw new IllegalArgumentException("datePicker format error");
                                }
                            } else if (this.f1308q == null) {
                                C0413pf pfVar3 = new C0413pf();
                                this.f1308q = pfVar3;
                                arrayList2.add(pfVar3);
                                this.f1308q.f10140d = this.f1312u.f10143b;
                                this.f1301a = i4;
                            } else {
                                throw new IllegalArgumentException("datePicker format error");
                            }
                        } else if (this.f1309r == null) {
                            C0413pf pfVar4 = new C0413pf();
                            this.f1309r = pfVar4;
                            arrayList2.add(pfVar4);
                            this.f1309r.f10141e = "%02d";
                            this.f1302b = i4;
                        } else {
                            throw new IllegalArgumentException("datePicker format error");
                        }
                    }
                    if (this.f10133l.size() != 0) {
                        if (this.f10133l.size() == 1) {
                            CharSequence charSequence = (CharSequence) this.f10133l.get(0);
                            this.f10133l.clear();
                            this.f10133l.add("");
                            for (int i5 = 0; i5 < arrayList2.size() - 1; i5++) {
                                this.f10133l.add(charSequence);
                            }
                            this.f10133l.add("");
                        } else if (this.f10133l.size() != arrayList2.size() + 1) {
                            throw new IllegalStateException("Separators size: " + this.f10133l.size() + " mustequal the size of columns: " + arrayList2.size() + " + 1");
                        }
                        this.f10130i.clear();
                        this.f10129h.removeAllViews();
                        this.f10131j = new ArrayList(arrayList2);
                        if (this.f10132k > this.f10131j.size() - 1) {
                            this.f10132k = this.f10131j.size() - 1;
                        }
                        LayoutInflater from = LayoutInflater.from(getContext());
                        int a2 = mo5732a();
                        if (!TextUtils.isEmpty((CharSequence) this.f10133l.get(0))) {
                            TextView textView = (TextView) from.inflate((int) R.layout.lb_picker_separator, this.f10129h, false);
                            textView.setText((CharSequence) this.f10133l.get(0));
                            this.f10129h.addView(textView);
                        }
                        int i6 = 0;
                        while (i6 < a2) {
                            VerticalGridView verticalGridView = (VerticalGridView) from.inflate((int) R.layout.lb_picker_column, this.f10129h, false);
                            mo5736a(verticalGridView);
                            verticalGridView.mo5613g(0);
                            verticalGridView.f1074n = false;
                            verticalGridView.setFocusable(isActivated());
                            verticalGridView.mo824a(0);
                            this.f10130i.add(verticalGridView);
                            this.f10129h.addView(verticalGridView);
                            int i7 = i6 + 1;
                            if (!TextUtils.isEmpty((CharSequence) this.f10133l.get(i7))) {
                                TextView textView2 = (TextView) from.inflate((int) R.layout.lb_picker_separator, this.f10129h, false);
                                textView2.setText((CharSequence) this.f10133l.get(i7));
                                this.f10129h.addView(textView2);
                            }
                            verticalGridView.mo831a(new C0410pc(this, this.f10134m, this.f10135n, i6));
                            boc boc = this.f10136o;
                            C0373nt ntVar = verticalGridView.f9985L;
                            if (boc != null) {
                                ArrayList arrayList3 = ntVar.f10048q;
                                if (arrayList3 == null) {
                                    ntVar.f10048q = new ArrayList();
                                } else {
                                    arrayList3.clear();
                                }
                                ntVar.f10048q.add(boc);
                            } else {
                                ntVar.f10048q = null;
                            }
                            i6 = i7;
                        }
                        m1442b();
                        return;
                    }
                    throw new IllegalStateException("Separators size is: " + this.f10133l.size() + ". At least one separator must be provided");
                }
                throw new IllegalStateException("Separators size: " + arrayList.size() + " must equal the size of datePickerFormat: " + string3.length() + " + 1");
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo1067a(int i, int i2) {
        this.f1313v.setTimeInMillis(this.f1306f.getTimeInMillis());
        int i3 = mo5733a(i).f10137a;
        if (i == this.f1302b) {
            this.f1313v.add(5, i2 - i3);
        } else if (i == this.f1301a) {
            this.f1313v.add(2, i2 - i3);
        } else if (i == this.f1303c) {
            this.f1313v.add(1, i2 - i3);
        } else {
            throw new IllegalArgumentException();
        }
        int i4 = this.f1313v.get(1);
        int i5 = this.f1313v.get(2);
        int i6 = this.f1313v.get(5);
        if (this.f1306f.get(1) != i4 || this.f1306f.get(2) != i6 || this.f1306f.get(5) != i5) {
            this.f1306f.set(i4, i5, i6);
            if (this.f1306f.before(this.f1304d)) {
                this.f1306f.setTimeInMillis(this.f1304d.getTimeInMillis());
            } else if (this.f1306f.after(this.f1305e)) {
                this.f1306f.setTimeInMillis(this.f1305e.getTimeInMillis());
            }
            m1442b();
        }
    }

    /* renamed from: a */
    private final boolean m1440a(String str, Calendar calendar) {
        try {
            calendar.setTime(this.f1311t.parse(str));
            return true;
        } catch (ParseException e) {
            Log.w("DatePicker", "Date: " + str + " not in format: MM/dd/yyyy");
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m1443b(C0413pf pfVar, int i) {
        if (i == pfVar.f10139c) {
            return false;
        }
        pfVar.f10139c = i;
        return true;
    }

    /* renamed from: a */
    public static boolean m1441a(C0413pf pfVar, int i) {
        if (i == pfVar.f10138b) {
            return false;
        }
        pfVar.f10138b = i;
        return true;
    }

    /* renamed from: b */
    private final void m1442b() {
        post(new C0408pa(this));
    }
}
