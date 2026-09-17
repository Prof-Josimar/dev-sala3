@echo off
setlocal

echo ==========================================
echo        GIT - DEV SALA 3 - JAVA
echo ==========================================
echo.

set "PROJETO=dev-sala3"
set "PROFESSOR=Josimar Ribeiro"
set "DISCIPLINA=Java"
set "IDE=IntelliJ IDEA"

echo Gerando README.md...

(
echo # %PROJETO%
echo.
echo ## Informacoes da Aula
echo.
echo - **Professor:** %PROFESSOR%
echo - **Disciplina:** %DISCIPLINA%
echo - **IDE:** %IDE%
echo - **Data:** %date%
echo - **Horario:** %time%
echo.
echo ## Ambiente
echo.
echo - **Hostname:** %COMPUTERNAME%
echo - **Usuario:** %USERNAME%
echo - **Diretorio:** %CD%
echo.
echo - **Java:**
java -version 2^>^&1
echo.
echo - **Git:**
git --version
echo.
echo ## Repositorio
echo.
echo - **GitHub:** Prof-Josimar/dev-sala3
echo - **Branch:** main
echo.
echo ## Objetivo
echo.
echo Projeto utilizado nas aulas praticas de Java.
echo Desenvolvimento realizado utilizando o IntelliJ IDEA.
echo.
echo ---
echo.
echo Atualizado automaticamente em %date% as %time%.
) > README.md

echo.
echo [1/5] Inicializando Git...
git init

echo.
echo [2/5] Adicionando arquivos...
git add . -v

echo.
echo [3/5] Criando commit...
git commit -m "Aula Java - %date% %time%"

echo.
echo [4/5] Configurando branch...
git branch -M main

echo.
echo [5/5] Enviando para GitHub...
git remote set-url origin git@github.com:Prof-Josimar/dev-sala3.git
git push -u origin main

echo.
echo ==========================================
echo          PROCESSO CONCLUIDO!
echo ==========================================
echo.
pause
