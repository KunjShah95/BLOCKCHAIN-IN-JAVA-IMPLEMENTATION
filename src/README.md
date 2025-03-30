# 🔗 Blockchain Implementation in Java

![License](https://img.shields.io/badge/license-MIT-blue)
![Java](https://img.shields.io/badge/Java-11%2B-orange)
![Status](https://img.shields.io/badge/status-stable-green)
![Build](https://img.shields.io/badge/build-passing-brightgreen)

A robust, educational implementation of blockchain technology in Java that demonstrates fundamental concepts of distributed ledger systems. This project includes a complete working cryptocurrency system with wallets, transactions, and proof-of-work mining.

## 📋 Table of Contents

- [Features](#-features)
- [Project Structure](#-project-structure)
- [Installation](#-installation)
- [Usage](#-usage)
- [Demo](#-demo)
- [Technical Details](#-technical-details)
- [Contributing](#-contributing)
- [Future Roadmap](#-future-roadmap)
- [License](#-license)
- [Acknowledgements](#-acknowledgements)

## ✨ Features

- 📦 Block creation with secure SHA-256 hash chaining
- ⛏️ Mining with configurable proof-of-work difficulty
- ✅ Built-in blockchain validation and integrity checking
- 👛 RSA cryptographic wallet generation
- 💸 Complete transaction system with digital signatures
- 📃 UTXO (Unspent Transaction Output) tracking system
- 🧪 Comprehensive testing examples

## 🏗️ Project Structure

```
src/
├── blockchain/
│   ├── Block.java              # Core block structure implementation
│   ├── StringUtil.java         # Cryptographic and hashing utilities
│   ├── NoobChain.java          # Main blockchain with transactions support
│   ├── NooberChain.java        # Simplified blockchain demo
│   ├── Wallet.java             # Digital wallet implementation
│   ├── WalletTest.java         # Wallet functionality tests
│   ├── Transaction.java        # Transaction handling implementation
│   ├── TransactionInput.java   # Transaction input components
│   ├── TransactionOutput.java  # Transaction output components
│   └── lib/                    # Library dependencies
└── compile_and_run.bat         # Windows batch script for easy execution
```

## 🔧 Installation

### Prerequisites

- Java JDK 11 or higher
- Java IDE (Optional - Eclipse, IntelliJ IDEA, or VS Code)

### Clone the Repository

```bash
git clone https://github.com/yourusername/blockchain-java.git
cd blockchain-java
```

## 🚀 Usage

### Windows

Run the provided batch script:

```bash
compile_and_run.bat
```

### Manual Compilation and Execution

```bash
# Navigate to src directory
cd src

# Compile the project
javac blockchain/*.java

# Run the blockchain demos
java blockchain.NoobChain    # Full blockchain with transactions
java blockchain.NooberChain  # Simplified blockchain
java blockchain.WalletTest   # Test wallet functionality
```

## 🔍 Demo

Running the main blockchain application (`NoobChain`) demonstrates:

1. Generation of RSA key pairs for wallets
2. Creation and mining of the genesis block
3. Addition of subsequent blocks with different data
4. Blockchain validation to ensure integrity
5. Output of the complete blockchain structure

## 🔧 Technical Details

### Block Structure

Each block contains:
- Hash of the block (calculated using SHA-256)
- Hash of the previous block (for blockchain integrity)
- Transaction data (or simple string data for demo blocks)
- Timestamp of block creation
- Nonce value (used in mining)

### Mining Process

The mining algorithm:
1. Takes a difficulty parameter (number of leading zeros required)
2. Increments a nonce value until a hash with the required difficulty is found
3. Demonstrates the computational work required to secure the blockchain

### Wallet Implementation

Wallets include:
- RSA key pair generation (public and private keys)
- Digitally signed transactions
- Balance tracking through UTXOs

### Transaction System

Transactions include:
- Digital signatures for security
- Multiple inputs and outputs
- UTXO tracking to prevent double-spending

## 👥 Contributing

Contributions are welcome! Please check our [CONTRIBUTING.md](CONTRIBUTING.md) file for guidelines.

1. Fork the repository
2. Create a feature branch: `git checkout -b new-feature`
3. Commit your changes: `git commit -am 'Add new feature'`
4. Push to the branch: `git push origin new-feature`
5. Submit a Pull Request

## 🛣️ Future Roadmap

- 🌐 Networking functionality for peer-to-peer communication
- 📊 Visual blockchain explorer
- 💻 Command-line interface for interactive blockchain management
- 📱 Android application for mobile wallet functionality
- 🔄 Consensus algorithm improvements (PoS implementation)
- 📄 Smart contract functionality
- 🧮 Enhanced transaction scripting capabilities

## 📜 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🙏 Acknowledgements

- Inspired by [Bitcoin's whitepaper](https://bitcoin.org/bitcoin.pdf) by Satoshi Nakamoto
- Special thanks to all blockchain technology contributors and researchers

---

<div align="center">
  <sub>Built with ❤️ by KUNJ SHAH</sub>
</div> 