---
layout: chapter
title: Resúmenes/Esquemas de análisis
---

<style>dt{color:#333;margin-top:0.8em;}</style>

## 1. Sucesiones y series funcionales. Series de potencias

## 2. Medidas de Lebesgue en `$\mathbb{R}^N$`

Teorema
: Sea $G$ **abierto** de $\mathbb{R}^N$. Entonces `$\exists \{Q_n\}$` cubos diádicos
tales que `$G=\bigcup\limits_{n}Q_n$` y `$\overline{Q_n}\subseteq G \forall n \in \mathbb{N}$`.

Corolario
: $\mathcal{B}$ es la menor $\sigma$-álgebra generada por la familia de intervalos
acotados $\mathcal{I}$.

Proposición (regularidad de la medida exterior)
: Sea $A \subseteq \mathbb{R}^N$. Entonces existe $B in \mathcal{B}$ tal que
`$A\subseteq B, \lambda^*(A) = \lambda^*(B)$`.

Proposición
: Sea $\mu^*$ una **medida exterior** sobre $\Omega$. Entonces, sea
`$$ \mathcal{C} = \{ E \subseteq \Omega : \mu^*(A) = \mu^*(A\cap E) + \mu^*(A \cap E^c) \forall A \subseteq \Omega\}$$`
tenemos que $\mathcal{C}$ es una $\sigma$-álgebra, y `$\mu^*_{|\mathcal{C}}$` es una medida.

Teorema (de existencia y unicidad de la medida de Lebesgue)
: 1. La familia `$M=\{A\cup Z : A \in \mathcal{B}, \lambda^*(Z) = 0\}$` es una $\sigma$-álgebra
     y `$\lambda^*_{|M}=\lambda$` es una medida.
  2. $\lambda(I) = v(I) \forall I \in \mathcal{I}$ y $\lambda$ es la única medida sobre
     $M$ que verifica esto.
  3. $M$ es la mayor $\sigma$-álgebra tal que $\lambda$ es aditiva.

Teorema (caracterización de la medida de Lebesgue)
: 1. Si $\mu$ es otra medida en $M$ **invariante por traslaciones** tal que $\mu([0,1]^N)=\alpha < \infty$,
     entonces $\mu = \alpha \lambda$.
  2. $\lambda$ es la única medida en M invariante por traslaciones que verifica $\lambda([0,1]^N)=1$.

Teorema (relación de aplicaciones lineales con la medida de Lebesgue)
: Sea $T: \mathbb{R}^N \rightarrow \mathbb{R}^N$ una aplicación **lineal** y sea $E\in M$. Entonces
  $T(E) \in M$ y $\lambda(T(E))=|det(T)| \lambda(E)$

Teorema (relación de la medida de Lebesgue con las funciones `$\mathcal{C}^1$`)
: $G \subseteq \mathbb{R}^N$ **abierto**, sea $\mathbf{f \in \mathcal{C}^1(G)}, f: G \rightarrow \mathbb{R}^N$. Entonces,

    1. $Z \subseteq G, \lambda(Z) = 0 \Rightarrow \lambda(f(Z)) = 0$.
    2. $E\in M, E \subseteq G \Rightarrow f(E) \in M$

Teorema (relación con el producto cartesiano)
: $E$ medible en $\mathbb{R}^N$, $F$ medible en $\mathbb{R}^M$. Entonces,

    1. $E\times F$ es medible en $\mathbb{R}^{N+M}$.
    2. $\lambda(E\times F) = \lambda(E)\lambda(F)$.


## 3. Funciones medibles

Proposición (estabilidad algebraica)
: Sea $(\Omega, \mathcal{A})$ espacio de medida, sean $f,g:\Omega \rightarrow \mathbb{R}$
  medibles, $\alpha\in\mathbb{R}$. Entonces:

  1. $f+g$ es medible
  1. $\alpha f$ es medible
  1. $f g$ es medible
  1. $g(x) \ne 0 \forall x \in \Omega \Rightarrow \frac{f}{g}$ es medible
  1. `$f \wedge g, f \vee g, f^+ = f \vee 0, f^- = -f \vee 0, |f|$` son medibles

Proposición (estabilidad analítica)
: Sea $(\Omega, \mathcal{A})$ espacio de medida, sean $f_n:(\Omega, \mathcal{A}) \rightarrow (\mathbb{R}, \mathcal{B})$
  medibles. Entonces,

  1. $E = \{ x \in \Omega : \{f_n(x)\} mayorado\}$ es medible
  1. $E = \{ x \in \Omega : \{f_n(x)\} minorado\}$ es medible
  1. $F_1 = \{ x \in \Omega : \limsup f_n(x) \in \mathbb{R}\}$ es medible
  1. $F_2 = \{ x \in \Omega : \liminf f_n(x) \in \mathbb{R}\}$ es medible
  1. `$F = \{ x \in \Omega : \lim f_n(x) \in \mathbb{R}\}, \tilde{f}(x) = \lim\limits_n f_n(x)$` son medibles
  1. `$G = \{ x \in \Omega : \sum\limits_{n\ge 1} f_n(x) converge\}, \tilde{f}(x) = \sum\limits_{n= 1}^{\infty} f_n(x)$` son medibles

Teorema (de aproximación de Lebesgue)
: Sea $(\Omega, \mathcal{A})$ espacio medible y sea $f: \Omega \rightarrow [0,+\infty[$
  **medible**. Entonces, `$\exists \{s_n\}$` sucesión creciente de funciones **simples** con `$\{s_n\} \rightarrow f$` (puntual).
  Si además $f$ está **acotada**, entonces `$\{s_n\} \rightarrow f$` (uniforme).

Teorema (de la convergencia creciente para funciones medibles positivas)
: Sea $E \subseteq \mathbb{R}^N$ medible y `$\{f_n\}\uparrow f$` (puntual) con
  `$f_n, f:E\rightarrow \mathbf{[0,+\infty[}$` **medibles**. Entonces
  `$\int_E f = \lim\limits_{n\rightarrow +\infty} \int_E f_n$`.

Teorema/Corolario
: Sea $E \in M, f: E \rightarrow [0,+\infty[$ medible. Entonces existe una sucesión
  `$\{s_n\}\uparrow f$` (puntual) con `$s_n$` simple $\forall n \in \mathbb{N}$
  y `$\int_E f = \lim\limits_{n\rightarrow +\infty} \int_E s_n$`.

Corolario
: Sea $E \in M, f: E \rightarrow [0,+\infty[$ medible. Sea `$\{E_n:n\in\mathbb{N}\}, E_n\in M$`
  con `$E_n\cap E_m = \varnothing (n\ne m)$`. Entonces, `$\int_{\cup E_n} f = \sum\limits_{n=1}^{+\infty} \int_{E_n} f$`

Corolario (funciones integrables)
: $E \in M, f: E \rightarrow \mathbb{R}$ medible. `$\{E_n : n\in \mathbb{N}\}, E_n \cap E_m = \varnothing (m\ne n)$`
  con `$E_n \in M$`. Entonces $f$ es integrable en $\cup E_n \Leftrightarrow$ se verifican:

  * `$E=\bigcup_{n=1}^{+\infty} E_n$`
  * $f$ es integrable en cada $E_n$
  * `$\sum\limits_{n\ge 1} \int_{E_n}|f| < \infty$`

  En tal caso, `$\int_E f = \sum\limits_{n=1}^{+\infty} \int_{E_n} f$`

## 4. Teoremas de convergencia

Teorema (de la convergencia monótona)
: $E \subseteq \mathbb{R}^N$ medible y sea `${f_n}$` una sucesión **monótona** de
  funciones integrables en $E$. Supongamos que `${\int_E f_n}$` está **acotada**. Entonces,
  `$\exists f: E \rightarrow\mathbb{R}$` integrable tal que `${f_n}\rightarrow f$` (cpd, en $E$)
  y `$\lim \int_E f_n = \int_E f$`.

Lema (de Fatou)
: $E \subseteq \mathbb{R}^N$ medible y `$f_n: E\rightarrow [0,+\infty[$` medibles, y supongamos
  `$\liminf \int_E f_n < \infty$`. Entonces, `$\liminf f_n$` es finito cpd y
  `$\int_E \liminf f_n \le \liminf \int_E f_n$`.

Teorema (de la convergencia dominada)
: $E \subseteq \mathbb{R}^N$ medible y sea `${f_n}$` una sucesión de
  funciones integrables en $E$. Supongamos que `$\{f_n\}\rightarrow f$` (puntual),
  y `$\exists g \in L_E : |f|\le g$`. Entonces `$f\in L_E$` y `$\lim_n\int_E |f-f_n|=0$`.

Consecuencia
: `$\lim\int f_n = \int \lim f_n$

Teorema (de la convergencia absoluta)
: $E \subseteq \mathbb{R}^N$ medible y sea `${f_n}$` una sucesión de
  funciones integrables en $E$. Supongamos que `$\sum\limits_{n=1}^{+\infty}\int_E|f_n|<\infty$`.
  Entonces `$\sum\limits{n\ge 1} f_n$` converge absolutamente casi por doquier en E,
  `$\lim_n\int_E |\sum\limits_{k=n}^{+\infty} f_k| = 0$`. En consecuencia,
  `$\int_E \sum\limits_{n=1}^{+\infty} f_n = \sum\limits_{n=1}^{+\infty} \int_E f_n$`.

Teorema (de Riesz)
: Para $E \subseteq \mathbb{R}^N$ medible, `$\mathcal{L}_E^1$` es un espacio de Banach.

Teorema (de Lebesgue de la caracterización de las funciones integrables de Riemann)
: `$f:[a,b]\rightarrow \mathbb{R}$` **acotada**. Entonces $f$ es Riemann-integrable en
  $[a,b]\Leftrightarrow f$ es continua cpd.

  En tal caso, `$\int_a^b f = \int_{[a,b]} f$`.

## 5. Técnicas de integración en una variable

Teorema (fundamental del Cálculo)
: Sea $f$ localmente integrable en $]\alpha,\beta[$, $a\in ]\alpha,\beta[$,
  $F(x) = \int_a^x f(t)dt$. Entonces,

  1. $F$ es continua en $]\alpha,\beta[$.
  1. $f$ es continua en $b \in ]\alpha,\beta[ \Rightarrow F$ es derivable en $b$
     y $F'(b) = f(b)$
  1. $F$ es derivable cpd.

Regla de Barrow (para integrales de Lebesgue)
: $f:]\alpha,\beta[\rightarrow\mathbb{R}$ localmente acotada y sea $G$ primitiva de $f$. Entonces,

  1. $f$ es medible en $]\alpha,\beta[$.
  1. $f$ integrable en `$]\alpha,\beta[\Rightarrow\int_\alpha^\beta f =\lim\limits_{x\rightarrow \beta} G(x) - \lim\limits_{x\rightarrow \alpha} G(x)$`
  1. $f\ge 0$ y `$\exists \lim\limits_{x\rightarrow \beta} G(x), \lim\limits_{x\rightarrow \alpha} G(x)\Rightarrow f$`
     integrable.

Teorema (del cambio de variable)
: Sean $-\infty \le \alpha < \beta \le +\infty, -\infty \le a < b \le +\infty, \phi: ]a,b[\rightarrow ]\alpha,\beta[$
  sobreyectiva y derivable con $\phi'(x) \ne 0 \forall x \in ]a,b[$, y $f:]\alpha,\beta[\rightarrow \mathbb{R}$
  medible. Entonces, `$f\in L_{]\alpha,\beta[}\Leftrightarrow (f\circ \phi) \phi' \in L_{]\alpha,\beta[}$`; y en tal caso,
  `$ \int_\alpha^\beta f = \int_{\phi^{-1}(\alpha^+)}^{\phi^{-1}(\beta^-)} (f\circ \phi)\phi'$`

Corolario (teorema de integración por partes)
: $u,v:]\alpha,\beta[\rightarrow\mathbb{R}$ derivables y supongamos $u'v,v'u$ integrables
  en $]\alpha,\beta[$. Entonces,
  `$$\int_\alpha^\beta uv' = [uv]_{\alpha^+}^{\beta^-} - \int_\alpha^\beta u'v$$`

## 6. Técnicas de integración en varias variables
