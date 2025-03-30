@echo off
echo Compiling blockchain code...
javac blockchain/*.java

if %ERRORLEVEL% EQU 0 (
    echo Compilation successful!
    
    echo.
    echo ===== Running NoobChain demonstration =====
    java blockchain.NoobChain
    
    echo.
    echo ===== Running Wallet test =====
    java blockchain.WalletTest
) else (
    echo Compilation failed.
)

pause 